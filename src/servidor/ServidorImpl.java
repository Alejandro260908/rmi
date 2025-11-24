package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ServidorImpl extends UnicastRemoteObject implements Servidor {

    private static ArrayList<Persona> listPersonas(){
        ArrayList<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(1,"Juan Perez", "jp@empresa.com", "administrador", 2500));
        lista.add(new Persona(2, "Luis Medina", "lm@empresa.com", "tecnico", 1500));
        lista.add(new Persona(3, "Carlos Trejo", "ct@empresa.com", "jefe de sistemas", 2000));
        lista.add(new Persona(4, "Machete", "ma@empresa.com", "tecnico", 1500));
        lista.add(new Persona(5, "Adolf Hitler", "ah@empresa.com", "colaborador", 900));
        lista.add(new Persona(6, "Jeffrey Empstein", "je@empresa.com", "colaborador", 900));
        lista.add(new Persona(7, "Donald Trump", "dt@empresa.com", "secretaria", 800));

        return lista;
    }

    private static String getPersona(int id) {

        return "Nombre: " + listPersonas().get(id-1).getNombre() + "\n"
                + "Correo: " + listPersonas().get(id-1).getCorreo() + "\n"
                + "Cargo: " + listPersonas().get(id-1).getCargo() + "\n"
                + "Sueldo: " + listPersonas().get(id-1).getSueldo() + "\n";
    }

    public ServidorImpl() throws RemoteException {
    }


    public static void main(String[] args) {


    }

    @Override
    public String consultar(int id) throws Exception {
        return null;
    }
}
