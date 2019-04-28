package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class JnuCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jnu_courses);

        webView = findViewById(R.id.jnu_courses);
        webView.loadUrl("https://www.jnu.ac.bd/portal/deptlist/5001");
    }
}
