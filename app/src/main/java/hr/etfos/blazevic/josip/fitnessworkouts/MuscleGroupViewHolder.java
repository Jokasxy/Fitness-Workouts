package hr.etfos.blazevic.josip.fitnessworkouts;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class MuscleGroupViewHolder extends GroupViewHolder
{
    private TextView tv_muscleGroupName;
    private ImageView iv_arrow;

    public MuscleGroupViewHolder(View itemView)
    {
        super(itemView);
        initializeUI();
    }

    private void initializeUI()
    {
        tv_muscleGroupName = itemView.findViewById(R.id.tv_muscleGroupName);
        iv_arrow = itemView.findViewById(R.id.iv_arrowMuscleGroup);
    }

    public void bind(MuscleGroup muscleGroup)
    {
        tv_muscleGroupName.setText(muscleGroup.getTitle());
    }

    @Override
    public void expand()
    {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        iv_arrow.setAnimation(rotate);
    }

    @Override
    public void collapse()
    {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        iv_arrow.setAnimation(rotate);
    }
}
