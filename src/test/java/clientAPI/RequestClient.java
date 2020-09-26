package clientAPI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * @autor : eynar.pari
 * @date : 26/09/2020.
 **/
public abstract class RequestClient {

    Client client = ClientBuilder.newBuilder().build();
    public abstract ResponseInformation send(RequestInformation request);

}
