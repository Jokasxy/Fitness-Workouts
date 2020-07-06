package hr.etfos.blazevic.josip.fitnessworkouts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ImageFragment extends Fragment
{
    private ImageView iv_exerciseImage;
    private static final String bundleImageUrl = "url";

    public static ImageFragment newInstance(String url)
    {
        Bundle args = new Bundle();
        args.putString(bundleImageUrl,  url);
        ImageFragment fragment = new ImageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.layout_slide_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        iv_exerciseImage = view.findViewById(R.id.iv_exerciseImage);
        displayImage();
    }

    public void displayImage()
    {

        if (getArguments() != null)
        {
            Glide.with(this).load(getArguments().getString(bundleImageUrl)).apply(new RequestOptions().override(iv_exerciseImage.getWidth(), iv_exerciseImage.getHeight())).into(iv_exerciseImage);
        }
    }
}
