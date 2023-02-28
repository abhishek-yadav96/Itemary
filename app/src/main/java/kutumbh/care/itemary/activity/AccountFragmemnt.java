package kutumbh.care.itemary.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import kutumbh.care.itemary.R;

public class AccountFragmemnt extends Fragment {

    public AccountFragmemnt(){
        // require a empty public constructor
    }
    LinearLayout home;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_account, container, false);

        home=view.findViewById( R.id.home_af );
        home.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );

        return view;

    }
}