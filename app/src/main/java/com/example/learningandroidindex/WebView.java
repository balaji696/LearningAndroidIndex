package com.example.learningandroidindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WebView extends AppCompatActivity {
    private EditText editLinkId;
    private String link;
    private WebViewClient MyBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        editLinkId=findViewById(R.id.editLinkId);
        Button loadPageId = findViewById(R.id.loadPageId);
        final android.webkit.WebView webView = findViewById(R.id.webViewid);
        webView.setWebViewClient(MyBrowser);

        loadPageId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link=editLinkId.getText().toString();
                if(!TextUtils.isEmpty(link)){
                    webView.loadUrl(link);//go to android manifests file at the top of the app and enbale internet permission to run program

                }
                else
                    Toast.makeText(WebView.this, "enter the valid link", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(android.webkit.WebView view, WebResourceRequest request) {
            view.loadUrl(link);
            return true;
        }
    }
}