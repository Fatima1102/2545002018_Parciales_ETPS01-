package sv.edu.utec.a2545002018parcial2etps1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList <Personas> lvPersonas;

    ListView Personas;

    Integer[] imgFoto ={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10
    };

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPersonas = new ArrayList<Personas>();

        lvPersonas.add(new Personas("Alexander", "CEO", "Insures S.O"));
        lvPersonas.add(new Personas("Carlos Lopez", "Asistente", "Hospital Blue"));
        lvPersonas.add(new Personas("Sara Bonz", "Directora de Marketing", "Electrical Parts LTD"));
        lvPersonas.add(new Personas("Liliana Clarence", "Diseñadora de Producto", "Creativa App"));
        lvPersonas.add(new Personas("Benito Peralta", "Supervisor de Ventas", "Neumaticos Press"));
        lvPersonas.add(new Personas("Juan Jaramillo", "CEO", "Banco Nacional"));
        lvPersonas.add(new Personas("Christian Steps", "CTO", "Cooperativa Verde"));
        lvPersonas.add(new Personas("Alexa Giraldo", "Lead Programmer", "Frutisofy"));
        lvPersonas.add(new Personas("Linda Murillo", "Directora de Marketing", "Seguros Boliver"));
        lvPersonas.add(new Personas("Lizete Astrada", "CEO", "Concesionario Motolox"));

        PersonasAdapter adapter = new PersonasAdapter(this);
        lvPersonas = findViewById(R.id.lvPersonas);



        lvPersonas.setadapter(adapter);

    }

    public class PersonasAdapter extends ArrayAdapter<Personas> {

        AppCompatActivity appCompatActivity;

        PersonasAdapter (AppCompatActivity context){
            super(context, R.layout.listapersonas, lvPersonas);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.listapersonas, null);

            ImageView imvProfileT = item.findViewById(R.id.imgFoto);
            imvProfileT.setImageResource(lvPersonas.get(position));

            TextView tvNameProfileT = item.findViewById(R.id.txvNombre);
            tvNameProfileT.setText(lvPersonas.get(position).getNombrePersonas());

            TextView tvPositionT = item.findViewById(R.id.txvCargo);
            tvPositionT.setText(lvPersonas.get(position).getCargoPersona());

            TextView tvCompanyT = item.findViewById(R.id.txvCompania);
            tvCompanyT.setText(lvPersonas.get(position).getCompaniaPersona());

            return(item);
        }

    }

}
