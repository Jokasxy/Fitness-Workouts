package hr.etfos.blazevic.josip.fitnessworkouts;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface MuscleGroupDao
{
    @Query("select * from muscleGroup")
    List<MuscleGroupData> getAllMuscleGroups();

    @Insert(onConflict = REPLACE)
    void insertMuscleGroup(MuscleGroupData muscleGroup);
}
