package servidor;

public class Persona {

    private int clave;
    private String nombre;
    private String correo;
    private String cargo;
    private String sueldo;

    public Persona(int clave, String nombre, String correo, String cargo, String sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSueldo() {
        return sueldo;
    }
}
