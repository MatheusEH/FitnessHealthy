package br.edu.unoesc.pdm.offtrail.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.WindowFeature;

import br.edu.unoesc.pdm.offtrail.R;
import br.edu.unoesc.pdm.offtrail.dao.DatabaseHelper;

@Fullscreen
@EActivity(R.layout.activity_splash)
@WindowFeature(Window.FEATURE_NO_TITLE)
public class SplashActivity extends AppCompatActivity {

    @Bean
    DatabaseHelper dh;

    @AfterViews

    //Tela de carregamento do FH
   public void inicializar(){
       // chamar a tela de login
       Handler h = new Handler();
       h.postDelayed(new Runnable() {
           @Override
           public void run() {
               // criando a intent de login
               Intent itLogin = new Intent(SplashActivity.this,
                       LoginActivity_.class);
               // chamando a tela de login
               startActivity(itLogin);
               // fechar a tela splash
               finish();
           }
       }, 4000);
   }
}
