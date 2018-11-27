package br.edu.unoesc.pdm.offtrail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import br.edu.unoesc.pdm.offtrail.R;
@EActivity(R.layout.activity_ex2)

public class Ex2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);
    }

    //chamada da tela do começo do exercício tipo2
    @Click(R.id.btnAquecimento2)
    public void Ex21(){
        Intent itExercicio21 = new Intent(this, Ex21Activity_.class);
        startActivity(itExercicio21);
    }
}
