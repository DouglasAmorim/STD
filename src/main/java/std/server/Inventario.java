package std.server;
import std.InventarioRMI;
import java.rmi.RemoteException;
import java.util.List;

public class Inventario implements InventarioRMI {

    private String name, mac, local, freq;

    @Override
    public void adicionaAP(String name, String mac, String freq, String local) throws RemoteException {
    this.mac = mac;
    this.name = name;
    this.freq = freq;
    this.local = local;
    }

    @Override
    public void removerAP(String name) throws RemoteException {

    }

    @Override
    public List<String> listarAP(String criterioFreq) throws RemoteException {
        return null;
    }
}
