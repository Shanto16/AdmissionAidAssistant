package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NsuMap extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsu_map);

        webView = findViewById(R.id.nsu_map);
        webView.loadUrl("https://goo.gl/maps/N1vvZbJiUizYaEvQ7");
    }
}
