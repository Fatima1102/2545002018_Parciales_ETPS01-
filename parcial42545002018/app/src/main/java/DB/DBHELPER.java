package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHELPER extends SQLiteOpenHelper {
    private static final int VERSION_BASEDATOS = 1;
    private static final String NOMBRE_BASE = "Parcial4.db";

    public DBHELPER(@Nullable Context context) {
        super(context, NOMBRE_BASE, null, VERSION_BASEDATOS);


    @Override
    public void onCreate (SQLiteDatabase db){
        db.execSQL("CREATE TABLE MD_Vehiculos (" +
                "ID_Vehiculo INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "sMarca TEXT, " +
                "sModelo TEXT);");

        db.execSQL("CREATE TABLE MD_Clientes (" +
                "ID_Cliente INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "sNombreCliente TEXT, " +
                "sApellidoCliente TEXT," +
                "sDireccionCliente TEXT," +
                "sCiudadCliente TEXT);");

        db.execSQL("CREATE TABLE MD_ClienteVehiculo (" +
                "idCliente INTEGER," +
                "idVehiculo INTEGER," +
                "sMatricula TEXT," +
                "iKilometro REAL," +
                "FOREIGN KEY(idCliente) REFERENCES MD_Clientes(ID_Cliente)," +
                "FOREIGN KEY(idVehiculo) REFERENCES MD_Vehiculos(ID_Vehiculo));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
    }
}

