package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.math.BigDecimal;
import compute.Compute;

public class ComputePi {
    public static void main(String args[]) {

        String host = (args.length < 1) ? "localhost" : args[0];
        int d = (args.length < 2) ? 500 : Integer.parseInt(args[1]);

        try {
            String name = "Compute";
            Registry registry = LocateRegistry.getRegistry(host, 8080);
            Compute comp = (Compute) registry.lookup(name);
            Pi task = new Pi(d);
            BigDecimal pi = comp.executeTask(task);
            System.out.println(pi);
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
    }
}
