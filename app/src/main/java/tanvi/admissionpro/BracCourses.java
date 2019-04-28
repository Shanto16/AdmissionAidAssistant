package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BracCourses extends AppCompatActivity {


    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brac_courses);

        webView = findViewById(R.id.nse_courses);

        webView.loadUrl("https://www.bracu.ac.bd/academics/programs/undergraduate");
    }
}
