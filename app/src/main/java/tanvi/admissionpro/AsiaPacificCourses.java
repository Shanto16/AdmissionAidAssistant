package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AsiaPacificCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia_pacific_courses);

        webView = findViewById(R.id.apu_courses);
        webView.loadUrl("https://admissions.apu.ac.jp/course/aps/subject/");
    }
}
