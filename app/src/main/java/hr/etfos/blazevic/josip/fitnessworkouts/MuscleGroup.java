package hr.etfos.blazevic.josip.fitnessworkouts;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class MuscleGroup extends ExpandableGroup<Exercise>
{
    public MuscleGroup(String title, List<Exercise> items)
    {
        super(title, items);
    }
}
