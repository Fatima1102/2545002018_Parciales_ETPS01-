package sv.edu.utec.p4d2545002018;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Button btnCliente, btnClienteVehiculo, btnVehiculo;

    DrawerLayout drwLayout;
    Toolbar tlBarra;
    NavigationView  navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tlBarra= findViewById(R.id.toolbar);
        drwLayout=findViewById(R.id.drawerLayout);
        navView=findViewById(R.id.navigator);
//24042023
        ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(this,drwLayout,tlBarra,R.string.open,R.string.close);
        drwLayout.addDrawerListener(toggle);
        toggle.syncState();
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white,null));

        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.menuCliente:

                        Toast.makeText(getApplicationContext(),"Cliente",Toast.LENGTH_SHORT).show();
                        fragmentosR(new Cliente());
                        break;
                    case R.id.menuClienteVehiculo:
                        fragmentosR(new ClienteVehiculo());
                        Toast.makeText(getApplicationContext(),"Cliente  Vehiculo",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menuVehiculo:
                        fragmentosR(new Vehiculos());
                        Toast.makeText(getApplicationContext(),"Vehiculos",Toast.LENGTH_SHORT).show();
                        break;
                }


                return true;
            }
        });
    }
    private void fragmentosR(Fragment fragment){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frmLayoutContenedor,fragment);
        fragmentTransaction.commit();

    }


}