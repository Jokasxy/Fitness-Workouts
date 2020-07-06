package hr.etfos.blazevic.josip.fitnessworkouts;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class ExerciseActivity extends AppCompatActivity
{
    private TextView tv_exerciseTitle, tv_exerciseDescription;
    private ViewPager viewPager;
    private WormDotsIndicator wormDotsIndicator;
    private Exercise exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        getIncomingIntent();
        initializeUI();
        initializeViewPager();
        bind();
        setUpPager();
    }

    private void getIncomingIntent()
    {
        if(getIntent().hasExtra(getString(R.string.str_exercise)))
        {
            exercise = getIntent().getExtras().getParcelable(getString(R.string.str_exercise));
        }
    }

    private void initializeUI()
    {
        tv_exerciseTitle = findViewById(R.id.tv_exerciseTitle);
        tv_exerciseDescription = findViewById(R.id.tv_exerciseDescription);
    }

    private void initializeViewPager()
    {
        viewPager = findViewById(R.id.viewPager);
        wormDotsIndicator = findViewById(R.id.worm_dots_indicator);
    }

    private void bind()
    {
        tv_exerciseTitle.setText(exercise.getName());
        tv_exerciseDescription.setText(exercise.getDescription());
    }

    private void setUpPager()
    {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), exercise);
        viewPager.setAdapter(pagerAdapter);
        wormDotsIndicator.setViewPager(viewPager);
    }
}
