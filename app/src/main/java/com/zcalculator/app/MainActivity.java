package com.zcalculator.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        WebView webView = new WebView(this);
        
        // Configuration hors ligne
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        
        // Désactiver le cache réseau pour forcer le local
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        
        // Charger depuis les assets (hors ligne)
        webView.loadUrl("file:///android_asset/calculator.html");
        
        setContentView(webView);
    }
}
