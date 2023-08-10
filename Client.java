package MainClient;
import serverwofacade.ServerWOFacade;
public class Client {
    public static void main(String[] args) {
        ServerWOFacade client = new ServerWOFacade();
        client.startServer();
        client.stopServer();
    }
}
