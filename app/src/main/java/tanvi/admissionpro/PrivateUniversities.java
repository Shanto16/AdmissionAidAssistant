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

    private LinearLayout ll_nsu,ll_brac,ll_iub,ll_ewu,ll_aiub,ll_uap,ll_uiu,ll_nu,ll_seu;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_private_university, container, false);


        ll_nsu = rootView.findViewById(R.id.ll_nsu);
        ll_brac = rootView.findViewById(R.id.ll_brac);
        ll_iub = rootView.findViewById(R.id.ll_iub);
        ll_ewu = rootView.findViewById(R.id.ll_ewu);
        ll_aiub = rootView.findViewById(R.id.ll_aiub);
        ll_uap = rootView.findViewById(R.id.ll_uap);
        ll_uiu = rootView.findViewById(R.id.ll_uiu);
        ll_nu = rootView.findViewById(R.id.ll_nu);
        ll_seu = rootView.findViewById(R.id.ll_seu);


        ll_nsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),UniversityProfile.class));
            }
        });

        ll_brac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),BracProfile.class));
            }
        });
        ll_iub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),IUBProfile.class));
            }
        });
        ll_ewu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),EWUProfile.class));
            }
        });
        ll_aiub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),AIUBProfile.class));
            }
        });
        ll_uap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),UAPProfile.class));
            }
        });
        ll_uiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),UIUProfile.class));
            }
        });
        ll_nu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),NUProfile.class));
            }
        });
        ll_seu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),SEUProfile.class));
            }
        });


        return rootView;
    }
}
