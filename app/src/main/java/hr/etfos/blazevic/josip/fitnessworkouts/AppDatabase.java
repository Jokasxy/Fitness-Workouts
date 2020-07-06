package hr.etfos.blazevic.josip.fitnessworkouts;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

@Database(entities = {ExerciseData.class, MuscleGroupData.class}, version = 1, exportSchema = false)
@TypeConverters(value = RoomTypeConverter.class)
public abstract class AppDatabase extends RoomDatabase
{
    private static AppDatabase databaseInstance;

    public abstract ExerciseDao ExerciseModel();
    public abstract MuscleGroupDao MuscleGroupModel();

    public static AppDatabase getDatabase(Context context)
    {
        if (databaseInstance == null)
            databaseInstance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "database").allowMainThreadQueries().build();
        return databaseInstance;
    }

    public static void destroyInstance()
    {
        databaseInstance = null;
    }

}