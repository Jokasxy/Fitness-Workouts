package hr.etfos.blazevic.josip.fitnessworkouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IDatabaseChecker
{
    private AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseInitializer.populateAsync(AppDatabase.getDatabase(this), this);
        setupRecyclerAdapter();
        initializeUI();
    }

    private void setupRecyclerAdapter()
    {
        List<MuscleGroup> muscleGroups = new ArrayList<>();
        for(MuscleGroupData muscleGroupData : AppDatabase.getDatabase(this).MuscleGroupModel().getAllMuscleGroups())
        {
            muscleGroups.add(muscleGroupData.mapTo());
        }
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ExpandableRecyclerAdapter adapter = new ExpandableRecyclerAdapter(muscleGroups, new OnItemClickListener()
        {
            @Override
            public void onItemClick(Exercise exercise)
            {
                Intent intent = new Intent(getBaseContext(), ExerciseActivity.class);
                intent.putExtra(getString(R.string.str_exercise), exercise);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(adapter);
    }

    private void initializeUI()
    {
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        ImageButton btn_search = findViewById(R.id.btn_search);
        autoCompleteTextView.setAdapter(new ArrayAdapter<String>
                (this, R.layout.layout_list, R.id.tv_listItem, AppDatabase.getDatabase(this).ExerciseModel().getAllExerciseNames()));
        btn_search.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final ExerciseData exerciseData =
                        AppDatabase.getDatabase(getBaseContext()).ExerciseModel().getExerciseByName(autoCompleteTextView.getText().toString());
                if(exerciseData != null)
                {
                    Intent intent = new Intent(getBaseContext(), ExerciseActivity.class);
                    intent.putExtra(getString(R.string.str_exercise),
                            exerciseData.mapTo());
                    startActivity(intent);
                }
                else
                    Toast.makeText(getBaseContext(), getString(R.string.str_invalidInput), Toast.LENGTH_SHORT).show();
                autoCompleteTextView.setText("");
            }
        });
    }

    @Override
    protected void onDestroy()
    {
        AppDatabase.destroyInstance();
        super.onDestroy();
    }

    @Override
    public void databaseCheck()
    {
        setupRecyclerAdapter();
        autoCompleteTextView.setAdapter(new ArrayAdapter<String>
                (this, R.layout.layout_list, R.id.tv_listItem, AppDatabase.getDatabase(this).ExerciseModel().getAllExerciseNames()));
    }
}
