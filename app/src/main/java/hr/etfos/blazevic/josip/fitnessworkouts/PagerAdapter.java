package hr.etfos.blazevic.josip.fitnessworkouts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter
{

    private List<String> exerciseUrls = new ArrayList<>();

    public PagerAdapter(FragmentManager fm, Exercise exercise)
    {
        super(fm);
        exerciseUrls.addAll(exercise.getUrl());
    }

    @Override
    public int getCount()
    {
        return exerciseUrls.size();
    }

    @Override
    public Fragment getItem(int position)
    {
        return ImageFragment.newInstance(exerciseUrls.get(position));
    }
}
