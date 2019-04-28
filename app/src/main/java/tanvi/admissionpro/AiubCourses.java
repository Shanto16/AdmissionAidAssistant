package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AiubCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiub_courses);
        
        webView =findViewById(R.id.aiub_courses);
        webView.loadUrl("http://www.aiub.edu/category/courses");
    }
}
