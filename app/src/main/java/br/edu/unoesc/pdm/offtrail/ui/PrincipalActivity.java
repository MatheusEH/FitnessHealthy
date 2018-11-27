package br.edu.unoesc.pdm.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import br.edu.unoesc.pdm.offtrail.R;
import br.edu.unoesc.pdm.offtrail.dao.DatabaseHelper;
import br.edu.unoesc.pdm.offtrail.model.Usuario;

@EActivity(R.layout.activity_principal)
public class PrincipalActivity extends AppCompatActivity {

    @Bean
    DatabaseHelper dh;

    //login
    @AfterViews
    public void inicilaizar(){
        Usuario u = (Usuario)getIntent().getSerializableExtra("usuario");
        Toast.makeText(this, "Seja bem-vindo " + u.getLogin(),Toast.LENGTH_LONG).show();
    }

    //tela sobre o app - fh
    @Click(R.id.btnSobre)
    public void sobre(){
        Intent itSobre = new Intent(this, SobreActivity_.class);
        startActivity(itSobre);
    }

    ///botoes de tipo de exercicio
    //tipo1
    @Click(R.id.btnEx1)
    public void Ex1(){
        Intent itExercicio1 = new Intent(this, Ex1Activity_.class);
        startActivity(itExercicio1);
    }

    //tipo2
    @Click(R.id.btnEx2)
    public void Ex2(){
        Intent itExercicio2 = new Intent(this, Ex2Activity_.class);
        startActivity(itExercicio2);
    }

    //tipo3
    @Click(R.id.btnEx3)
    public void Ex3(){
        Intent itExercicio3 = new Intent(this, Ex3Activity_.class);
        startActivity(itExercicio3);
    }

    //sair
    @Click(R.id.btnSair)
    public void sair(){
        finish();
        System.exit(0);
    }
}
