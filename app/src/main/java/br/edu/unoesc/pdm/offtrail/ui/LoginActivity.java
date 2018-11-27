package br.edu.unoesc.pdm.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;

import java.sql.SQLException;

import br.edu.unoesc.pdm.offtrail.R;
import br.edu.unoesc.pdm.offtrail.dao.DatabaseHelper;
import br.edu.unoesc.pdm.offtrail.model.Usuario;

@EActivity(R.layout.activity_login)
@WindowFeature(Window.FEATURE_NO_TITLE)
public class LoginActivity extends AppCompatActivity {
    @Bean
    DatabaseHelper dh;

    @ViewById
    protected EditText edtLogin;
    @ViewById
    protected EditText edtSenha;
    @ViewById
    protected Button btnLogin;
    @ViewById
    protected Button btnCancelar;

    //realizar login (login=fh senha=fh)
    @Click(R.id.btnLogin)
    public void validaLogin() {
        Usuario u = null;
        try {
             u = dh.validaLogin(edtLogin.getText().toString(), edtSenha.getText().toString());
            if (u == null) {
                Toast.makeText(this, "usuario/senha inválidos", Toast.LENGTH_LONG).show();
                edtLogin.setText("");
                edtSenha.setText("");
                edtLogin.requestFocus();
            } else {
               Intent itPrincipal = new Intent(this, PrincipalActivity_.class);
               itPrincipal.putExtra("usuario", u);
               startActivity(itPrincipal);
               finish();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //cancelar login
    @Click(R.id.btnCancelar)
    public void cancelar(){
        finish();
        System.exit(0);
    }
}