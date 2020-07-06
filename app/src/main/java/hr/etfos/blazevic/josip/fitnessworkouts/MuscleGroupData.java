package hr.etfos.blazevic.josip.fitnessworkouts;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

import hr.etfos.blazevic.josip.fitnessworkouts.Exercise;
import hr.etfos.blazevic.josip.fitnessworkouts.ExerciseData;
import hr.etfos.blazevic.josip.fitnessworkouts.IMapper;
import hr.etfos.blazevic.josip.fitnessworkouts.MuscleGroup;

@Entity(tableName = "muscleGroup")
public class MuscleGroupData implements IMapper<MuscleGroup>
{
    @PrimaryKey
    private int id;
    private String title;
    private List<ExerciseData> exercises;

    public MuscleGroupData(int id, String title, List<ExerciseData> exercises)
    {
        this.id = id;
        this.title = title;
        this.exercises = exercises;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public List<ExerciseData> getExercises()
    {
        return exercises;
    }

    @Override
    public MuscleGroup mapTo()
    {
        List<Exercise> dataList = new ArrayList<>();
        for(ExerciseData exerciseData : exercises)
        {
            dataList.add(exerciseData.mapTo());
        }
        return new MuscleGroup(title, dataList);
    }
}
