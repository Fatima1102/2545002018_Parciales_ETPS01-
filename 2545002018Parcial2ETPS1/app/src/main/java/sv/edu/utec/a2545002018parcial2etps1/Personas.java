package sv.edu.utec.a2545002018parcial2etps1;

public class Personas {
    private String NombrePersonas;

    public String getNombrePersonas() {
        return NombrePersonas;
    }

    public void setNombrePersonas(String Nombre) {
        NombrePersonas = Nombre;
    }

    private String CargoPersona;

    public String getCargoPersona() {
        return CargoPersona;
    }

    public void setCargoPersona(String Cargo) {
        CargoPersona = Cargo;
    }
    private String CompaniaPersona;

    public String getCompaniaPersona() {
        return CompaniaPersona;
    }

    public void setCompaniaPersona(String Compania) {
        CompaniaPersona = Compania;
    }

    public Personas (String Nombre, String Cargo, String Compania) {
        this.NombrePersonas=Nombre;
        this.CargoPersona=Cargo;
        this.CompaniaPersona=Compania;
    }

}
