package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CuCourses extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cu_courses);

        webView = findViewById(R.id.cu_courses);
        webView.loadUrl("https://sites.google.com/site/chittagonguniversity/departments");
    }
}
