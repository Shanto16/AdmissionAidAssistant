package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RuetCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruet_courses);

        webView = findViewById(R.id.ruet_courses);
        webView.loadUrl("http://www.ruet.ac.bd/articles/Heads%20of%20Departments/15");
    }
}
