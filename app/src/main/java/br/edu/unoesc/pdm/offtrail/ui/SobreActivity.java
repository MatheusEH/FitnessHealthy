package br.edu.unoesc.pdm.offtrail.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.EActivity;

import br.edu.unoesc.pdm.offtrail.R;

@EActivity(R.layout.activity_sobre)
public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }
}
