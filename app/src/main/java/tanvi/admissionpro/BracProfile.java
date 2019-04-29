package tanvi.admissionpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BracProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brac);

        Button btn_course = findViewById(R.id.btn_courses);
        Button btn_maps= findViewById(R.id.btn_map);



        btn_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BracProfile.this,BracMap.class));
            }
        });

        btn_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BracProfile.this,BracCourses.class));
            }
        });
    }
}
