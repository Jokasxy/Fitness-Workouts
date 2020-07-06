package hr.etfos.blazevic.josip.fitnessworkouts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ExpandableRecyclerAdapter extends ExpandableRecyclerViewAdapter<MuscleGroupViewHolder, ExerciseViewHolder>
{
    private OnItemClickListener listener;

    ExpandableRecyclerAdapter(List<? extends ExpandableGroup> groups, OnItemClickListener listener)
    {
        super(groups);
        this.listener =  listener;
    }

    @Override
    public MuscleGroupViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_muscle_group, parent, false);
        return new MuscleGroupViewHolder(view);
    }

    @Override
    public ExerciseViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_exercise, parent, false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ExerciseViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex)
    {
        final Exercise exercise = (Exercise) group.getItems().get(childIndex);
        holder.bind(exercise, listener);
    }

    @Override
    public void onBindGroupViewHolder(MuscleGroupViewHolder holder, int flatPosition, ExpandableGroup group)
    {
        final MuscleGroup muscleGroup = (MuscleGroup) group;
        holder.bind(muscleGroup);
    }

}
