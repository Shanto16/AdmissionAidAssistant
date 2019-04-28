package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class IubMap extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iub_map);

        webView = findViewById(R.id.iub_map);
        webView.loadUrl("https://goo.gl/maps/4Je1D4XgQcj94pFR8");
    }
}
