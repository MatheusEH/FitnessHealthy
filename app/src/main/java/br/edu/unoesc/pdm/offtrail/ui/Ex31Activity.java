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
@EActivity(R.layout.activity_ex31)
public class Ex31Activity extends AppCompatActivity {

    WebView wv;
    @Override
    public void onBackPressed(){
        if (wv.canGoBack()){
            wv.goBack();
        }else{
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex31);

        wv = (WebView) findViewById(R.id.wv);
        //enable JavaScript
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setFocusable(true);
        wv.setFocusableInTouchMode(true);
        //prioridade
        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setDatabaseEnabled(true);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //carregar URL
        wv.loadUrl("https://www.youtube.com/watch?v=1lJV-34mQwI");
        wv.setWebViewClient(new WebViewClient());
    }
    //proxima tela
    @Click(R.id.btnProx)
    public void Ex32(){
        Intent itExercicio32 = new Intent(this, Ex32Activity_.class);
        startActivity(itExercicio32);
    }
}
