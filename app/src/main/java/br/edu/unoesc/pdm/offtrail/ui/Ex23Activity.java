package br.edu.unoesc.pdm.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import br.edu.unoesc.pdm.offtrail.R;
@EActivity(R.layout.activity_ex23)
public class Ex23Activity extends AppCompatActivity {

    WebView wv3;
    @Override
    public void onBackPressed(){
        if (wv3.canGoBack()){
            wv3.goBack();
        }else{
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex23);

        wv3 = (WebView) findViewById(R.id.wv3);
        //enable JavaScript
        wv3.getSettings().setJavaScriptEnabled(true);
        wv3.setFocusable(true);
        wv3.setFocusableInTouchMode(true);
        //prioridade
        wv3.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv3.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv3.getSettings().setDomStorageEnabled(true);
        wv3.getSettings().setDatabaseEnabled(true);
        wv3.getSettings().setAppCacheEnabled(true);
        wv3.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //carregar URL
        wv3.loadUrl("https://www.youtube.com/watch?v=qDAoUOmdbi4");
        wv3.setWebViewClient(new WebViewClient());
    }
    //proxima tela
    @Click(R.id.btnIni)
    public void menu(){
        Intent itmenu = new Intent(this, LoginActivity_.class);
        startActivity(itmenu);
    }
}
