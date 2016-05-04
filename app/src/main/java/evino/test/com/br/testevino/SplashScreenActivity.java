package evino.test.com.br.testevino;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by techresult on 04/05/2016.
 */
public class SplashScreenActivity extends AppCompatActivity {

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
                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, 5000);
    }

}
