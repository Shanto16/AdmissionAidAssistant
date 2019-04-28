package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UiuCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiu_courses);

        webView = findViewById(R.id.uiu_courses);
        webView.loadUrl("http://sobe.uiu.ac.bd/bba/bba-in-ais/list-of-courses/");
    }
}
