package evino.test.com.br.testevino.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import evino.test.com.br.testevino.R;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by techresult on 04/05/2016.
 */
public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Verifica se tem token salvo

        // Se SIM, abre a Splashscreen  e verifica se o token está válido
            //Se SIM, abre a tela com lista de vinhos
            //Se NÃO, abre a tela de login

        //Se NÃO, abre o SplashScreen por 5 segundos e em seguida abre a tela de login
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(i);

                finish();
            }
        }, 5000);
    }

}
