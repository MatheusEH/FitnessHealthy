package br.edu.unoesc.pdm.offtrail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import br.edu.unoesc.pdm.offtrail.R;
@EActivity(R.layout.activity_ex1)
public class Ex1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
    }

    //chamada da tela do começo do exercício tipo1
    @Click(R.id.btnAquecimento)
    public void Ex11(){
        Intent itExercicio11 = new Intent(this, Ex11Activity_.class);
        startActivity(itExercicio11);
    }
}
