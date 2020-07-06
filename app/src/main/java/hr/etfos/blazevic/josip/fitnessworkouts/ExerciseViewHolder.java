package hr.etfos.blazevic.josip.fitnessworkouts;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ExerciseViewHolder extends ChildViewHolder
{
    private CardView cardView;
    private TextView tv_exerciseName;

    public ExerciseViewHolder(View itemView)
    {
        super(itemView);
        initializeUI();
    }

    private void initializeUI()
    {
        tv_exerciseName = itemView.findViewById(R.id.tv_exerciseName);
        cardView = itemView.findViewById(R.id.cv_exercise);
    }

    public void bind(final Exercise exercise, final OnItemClickListener listener)
    {
        tv_exerciseName.setText(exercise.getName());
        cardView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                listener.onItemClick(exercise);
            }
        });
    }
}
