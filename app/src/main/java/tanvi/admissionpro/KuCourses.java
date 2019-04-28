package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KuCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ku_courses);

        webView = findViewById(R.id.ku_courses);
        webView.loadUrl("https://www.researchgate.net/institution/Khulna_University/departments");
    }
}
