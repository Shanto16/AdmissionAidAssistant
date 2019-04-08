package tanvi.admissionpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class PublicUniversities extends Fragment {
    private LinearLayout ll_du,ll_jhu,ll_ju,ll_buet,ll_ru,ll_ku,ll_cu,ll_ruet,ll_kuet;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_public_university, container, false);

        ll_du = rootView.findViewById(R.id.ll_du);
        ll_jhu = rootView.findViewById(R.id.ll_jhu);
        ll_ju = rootView.findViewById(R.id.ll_ju);
        ll_buet = rootView.findViewById(R.id.ll_buet);
        ll_ru = rootView.findViewById(R.id.ll_ru);
        ll_ku = rootView.findViewById(R.id.ll_ku);
        ll_cu = rootView.findViewById(R.id.ll_cu);
        ll_ruet = rootView.findViewById(R.id.ll_ruet);
        ll_kuet = rootView.findViewById(R.id.ll_kuet);

        ll_du.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),DUProfile.class));
            }
        });

        ll_jhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),JHUProfile.class));
            }
        });
        ll_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),JUProfile.class));
            }
        });
        ll_buet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),BracProfile.class));
            }
        });
        ll_ru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),RUProfile.class));
            }
        });
        ll_ku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),KUProfile.class));
            }
        });
        ll_cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),CUProfile.class));
            }
        });
        ll_ruet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),CUETProfile.class));
            }
        });
        ll_kuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),CUETProfile.class));
            }
        });

        return rootView;
    }
}
