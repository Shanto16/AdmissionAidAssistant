package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DuCourses extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_du_courses);

        webView = findViewById(R.id.du_courses);
        webView.loadUrl("1.\thttp://www.du.ac.bd/footer_widget/footer_widget_item/courses");
    }
}
