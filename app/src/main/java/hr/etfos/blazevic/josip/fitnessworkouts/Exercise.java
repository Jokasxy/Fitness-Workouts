package hr.etfos.blazevic.josip.fitnessworkouts;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;


public class Exercise implements Parcelable
{

    private final String name;
    private final String description;
    private List<String> url;


    public Exercise(String name, String description, List<String> url)
    {
        this.name = name;
        this.description = description;
        this.url = url;
    }


    protected Exercise(Parcel in)
    {
        name = in.readString();
        description = in.readString();
        url = in.createStringArrayList();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeStringList(url);
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    public static final Creator<Exercise> CREATOR = new Creator<Exercise>()
    {
        @Override
        public Exercise createFromParcel(Parcel in)
        {
            return new Exercise(in);
        }

        @Override
        public Exercise[] newArray(int size)
        {
            return new Exercise[size];
        }
    };

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
}
