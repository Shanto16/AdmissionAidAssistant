package tanvi.admissionpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class PrivateUniversities extends Fragment {

    private LinearLayout ll_nsu;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_private_university, container, false);


        ll_nsu = rootView.findViewById(R.id.ll_nsu);

        ll_nsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),UniversityProfile.class));
            }
        });

        return rootView;
    }
}
