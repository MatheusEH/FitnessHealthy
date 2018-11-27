package br.edu.unoesc.pdm.offtrail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import br.edu.unoesc.pdm.offtrail.R;
@EActivity(R.layout.activity_ex3)

public class Ex3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);
    }

    //chamada da tela do começo do exercício tipo3
    @Click(R.id.btnAquecimento3)
    public void Ex31(){
        Intent itExercicio31 = new Intent(this, Ex31Activity_.class);
        startActivity(itExercicio31);
    }
}
