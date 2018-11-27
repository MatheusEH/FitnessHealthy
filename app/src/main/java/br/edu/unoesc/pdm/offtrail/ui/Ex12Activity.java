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
@EActivity(R.layout.activity_ex12)
public class Ex12Activity extends AppCompatActivity {

    WebView wv2;
    @Override
    public void onBackPressed(){
        if (wv2.canGoBack()){
            wv2.goBack();
        }else{
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex12);

        wv2 = (WebView) findViewById(R.id.wv2);
        //enable JavaScript
        wv2.getSettings().setJavaScriptEnabled(true);
        wv2.setFocusable(true);
        wv2.setFocusableInTouchMode(true);
        //prioridade
        wv2.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv2.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv2.getSettings().setDomStorageEnabled(true);
        wv2.getSettings().setDatabaseEnabled(true);
        wv2.getSettings().setAppCacheEnabled(true);
        wv2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //carregar URL
        wv2.loadUrl("https://www.youtube.com/watch?v=NZLF9xI26Y0");
        wv2.setWebViewClient(new WebViewClient());
    }
    //proxima tela
    @Click(R.id.btnProx2)
    public void Ex13(){
        Intent itExercicio13 = new Intent(this, Ex13Activity_.class);
        startActivity(itExercicio13);
    }
}
