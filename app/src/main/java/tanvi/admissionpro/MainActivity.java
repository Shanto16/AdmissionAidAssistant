package tanvi.admissionpro;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout uniType;
    private ViewPager container;
    PagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uniType = findViewById(R.id.tl_varsityType);
        container = findViewById(R.id.container_university);

        uniType.addTab(uniType.newTab().setText("Private "));
        uniType.addTab(uniType.newTab().setText("Public "));

        container.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(uniType));

        uniType.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                container.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        adapter = new PagerAdapter(getSupportFragmentManager(),uniType.getTabCount());
        container.setAdapter(adapter);

        uniType.setupWithViewPager(container);
    }

    public class PagerAdapter extends FragmentStatePagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    PrivateUniversities tab1 = new PrivateUniversities();
                    return tab1;
                case 1:
                    PublicUniversities tab2 = new PublicUniversities();

                    return tab2;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }

    }

}
