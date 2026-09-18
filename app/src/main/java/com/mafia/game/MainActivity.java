package com.mafia.game;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        
        // تفعيل الجافاسكربت وقواعد البيانات لتعمل اللعبة (Firebase)
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        
        setContentView(webView);
        
        // تشغيل ملف الويب الخاص بك
        webView.loadUrl("file:///android_asset/index.html");
    }
}
