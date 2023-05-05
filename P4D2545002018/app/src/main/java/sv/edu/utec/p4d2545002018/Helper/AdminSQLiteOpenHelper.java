package sv.edu.utec.cuartop2530892009.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase ParcialDiferido) {
        ParcialDiferido.execSQL("CREATE TABLE MD_Clientes (ID_Cliente integer primary key, sNombreCliente text, sApellidoCliente text, sDireccion text, sCiudad text)");
        ParcialDiferido.execSQL("CREATE TABLE MD_Vehiculos (ID_Vehiculo integer primary key, sMarca text, sModelo text)");
        ParcialDiferido.execSQL("CREATE TABLE MD_ClienteVehiculo (ID_Cliente integer, ID_Vehiculo integer, sMatricula text, iKilometros text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
