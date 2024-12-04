package Lektion21.Ubung2;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class WIkipediaCLient {
    public static void main(String[] args){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://en.wikipedia.org/wiki/Java_(programming_language)");
        Response response = target.request(MediaType.TEXT_HTML).get();
        String htmlResponse = response.readEntity(String.class);
        System.out.println(htmlResponse);

        Client client2 = ClientBuilder.newClient();
        WebTarget target2= client2.target("https://jsonplaceholder.typicode.com/posts/1");
        Response response2=target2.request(MediaType.APPLICATION_JSON).get();
        String jsonResponse = response2.readEntity(String.class);
        System.out.println(jsonResponse);
    }
}
