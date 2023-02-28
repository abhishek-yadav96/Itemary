package kutumbh.care.itemary.activity;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.fragment.app.Fragment;

import kutumbh.care.itemary.R;


public class HomeFragment extends Fragment {

    public HomeFragment(){
        // require a empty public constructor
    }
    ViewFlipper slider;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate( R.layout.fragment_homee, container, false);




        int imgarray[]={R.drawable.image1,R.drawable.image2,R.drawable.image3};
        slider=(ViewFlipper)view.findViewById(R.id.slider  );
        for(int i =0;i<imgarray.length;i++)
            showimage(imgarray[i]);


        return view;
    }

    private void showimage(int i) {



            ImageView imageView=new ImageView(getContext());
            imageView.setBackgroundResource(i);

            slider.addView(imageView);
            slider.setFlipInterval(3000);
            slider.setAutoStart(true);

            slider.setInAnimation(getContext(), android.R.anim.slide_in_left);
            slider.setOutAnimation(getContext(), android.R.anim.slide_out_right);




    }
}