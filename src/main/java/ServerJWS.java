import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String address = "http://0.0.0.0:1717/";
        Endpoint.publish(address, new BanqueService());
        System.out.println("Web service deploye sur l'adresse "+ address);
    }
}
