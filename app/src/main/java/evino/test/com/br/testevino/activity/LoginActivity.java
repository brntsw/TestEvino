package evino.test.com.br.testevino.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import evino.test.com.br.testevino.R;
import evino.test.com.br.testevino.interfaces.IUIComponents;
import evino.test.com.br.testevino.utils.ToastUtils;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class LoginActivity extends AppCompatActivity implements IUIComponents {

    private Button btLogar;
    private EditText editUser;
    private EditText editPass;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initializeComponents();
    }

    protected void onResume(){
        super.onResume();

        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editUser.getText().toString();
                String pass = editPass.getText().toString();

                if(!user.equals("") && !pass.equals("")){
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);

                    finish();
                }
                else{
                    if(user.equals("")){
                        Toast.makeText(LoginActivity.this, ToastUtils.increaseToastText(getResources().getString(R.string.type_user)), Toast.LENGTH_SHORT).show();
                    }
                    else if(pass.equals("")){
                        Toast.makeText(LoginActivity.this, ToastUtils.increaseToastText(getResources().getString(R.string.type_pass)), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void initializeComponents() {
        editUser = (EditText) findViewById(R.id.edit_user);
        editPass = (EditText) findViewById(R.id.edit_password);
        btLogar = (Button) findViewById(R.id.bt_login);
    }
}
