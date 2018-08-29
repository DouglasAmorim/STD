package std;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
import java.util.List;

public interface InventarioRMI extends Remote{

    public void adicionaAP(String name, String mac, String freq, String local) throws RemoteException;
    public void removerAP(String name) throws RemoteException;
    public List<String> listarAP(String criterioFreq) throws RemoteException;
}
