package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class EwuCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewu_courses);

        webView = findViewById(R.id.ewu_courses);
        webView.loadUrl("http://www.ewubd.edu/course-catalog/");
    }
}
