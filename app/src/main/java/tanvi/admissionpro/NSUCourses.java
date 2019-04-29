package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NSUCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsucourses);

        webView = findViewById(R.id.nsu_courses);

        webView.loadUrl("http://ece.northsouth.edu/");

    }
}
