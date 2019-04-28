package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NuCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu_courses);

        webView = findViewById(R.id.nu_courses);
        webView.loadUrl(" https://nub.ac.bd/academic/t3gwthgw/academic-programs");
    }
}
