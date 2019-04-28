package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BuetCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buet_courses);

        webView = findViewById(R.id.buet_courses);
        webView.loadUrl("http://www.buet.ac.bd/Department/Faculties");
    }
}
