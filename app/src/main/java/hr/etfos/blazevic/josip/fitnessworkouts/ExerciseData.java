package hr.etfos.blazevic.josip.fitnessworkouts;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;

import hr.etfos.blazevic.josip.fitnessworkouts.Exercise;

@Entity(tableName = "exercise")
public class ExerciseData implements IMapper<Exercise> {

    @PrimaryKey
    @NonNull
    private final String name;
    private final String description;
    private List<String> url;

    public ExerciseData(@NonNull String name, String description, List<String> url) {
        this.name = name;
        this.description = description;
        this.url = url;
    }

    @NonNull
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public List<String> getUrl()
    {
        return url;
    }

    @Override
    public Exercise mapTo()
    {
        return new Exercise(name, description, url);
    }
}
