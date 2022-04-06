import java.rmi.*;
 
public interface Hello extends Remote {
   public double multiplica(double a, double b, double c) throws RemoteException;
}
