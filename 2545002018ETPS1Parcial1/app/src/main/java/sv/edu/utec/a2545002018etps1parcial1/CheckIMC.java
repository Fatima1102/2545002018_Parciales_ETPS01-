package sv.edu.utec.a2545002018etps1parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CheckIMC extends AppCompatActivity {

    EditText edtWeight, edtHeight;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_imc);

        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        tvResults = findViewById(R.id.tvResults);
    }

    public void Results (View v){
        Double Weight, Height, imc;

        Weight = Double.parseDouble(edtWeight.getText().toString());
        Height = Double.parseDouble(edtWeight.getText().toString());

        imc = (Weight) / (Height * Height);

            if (imc < 10.5 ){
                tvResults.setText("Críticamente Bajo de Peso.  \n Indice de masa corporal: " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 15.9) {
                tvResults.setText("Severamente Bajo de Peso. \n Indice de masa corporal:" + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 18.5){
                tvResults.setText("Bajo de Peso. \n Indice de masa corporal" + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 25){
                tvResults.setText("Normal (peso saludable).\n Indice de masa corporal:" + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 30){
                tvResults.setText("Sobrepeso. \n Indice de masa corporal:" + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 35){
                tvResults.setText("Obesidad Clase 1 - Moderadamente Obeso. Indice de masa corporal es:" + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 40){
                tvResults.setText("Obesidad Clase 2 - Severamente Obeso. Indice de masa corporal es: " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc > 50){
                tvResults.setText("Obesidad Clase 3 - Críticamente Obeso. Indice de masa corporal es:" + String.valueOf(String.format("%.2f",imc)));
            }

            edtWeight.setText("");
            edtHeight.setText("");

    }
}