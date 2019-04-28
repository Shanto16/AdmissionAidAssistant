package tanvi.admissionpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BracMap extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brac_map);

        webView = findViewById(R.id.brac_map);
        webView.loadUrl("https://goo.gl/maps/5Jv6m9sg9rToQ4BF8");
    }
}
