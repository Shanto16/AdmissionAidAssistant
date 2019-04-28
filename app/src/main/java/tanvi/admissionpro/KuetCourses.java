package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KuetCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuet_courses);

        webView = findViewById(R.id.kuet_courses);
        webView.loadUrl("http://www.kuet.ac.bd/index.php/welcome/department");
    }
}
