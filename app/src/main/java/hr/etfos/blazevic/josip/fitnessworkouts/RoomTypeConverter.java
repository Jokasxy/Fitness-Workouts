package hr.etfos.blazevic.josip.fitnessworkouts;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;


public class RoomTypeConverter
{

    private static Gson gson = new Gson();

    @TypeConverter
    public static List<String> stringToSomeObjectList(String data)
    {
        if (data == null)
        {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<String>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToString(List<String> someObjects)
    {
        return gson.toJson(someObjects);
    }

    @TypeConverter
    public static List<ExerciseData> stringToExerciseList(String data)
    {
        if (data == null)
        {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<ExerciseData>>() {}.getType();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String exerciseListToString(List<ExerciseData> someObjects)
    {
        return gson.toJson(someObjects);
    }

}
