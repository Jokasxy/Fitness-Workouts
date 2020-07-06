package hr.etfos.blazevic.josip.fitnessworkouts;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface ExerciseDao
{
    @Query("select * from exercise where name =:name")
    ExerciseData getExerciseByName(String name);

    @Query("select name from exercise")
    List<String> getAllExerciseNames();

    @Insert(onConflict = REPLACE)
    void insertExercise(ExerciseData exercise);
}