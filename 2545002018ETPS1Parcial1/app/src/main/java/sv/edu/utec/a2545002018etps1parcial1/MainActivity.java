package sv.edu.utec.a2545002018etps1parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtpPass);
        tvMessage = findViewById(R.id.tvMessage);
    }


    public void Singing (View v){
        String Username, Password;

        Username = edtUser.getText().toString();
        Password = edtPass.getText().toString();

        if (Username.equals("parcialETps1") && Password.equals("p4rC14l#tp$"))
        {
            startActivity(new Intent(MainActivity.this, CheckIMC.class));
        }
        else
        {
            tvMessage.setText("Usuario o contraseña invalidos. Intente nuevavamente");
        }
    }
}