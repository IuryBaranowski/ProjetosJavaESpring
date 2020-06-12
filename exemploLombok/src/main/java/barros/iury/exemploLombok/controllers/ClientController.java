package barros.iury.exemploLombok.controllers;

import barros.iury.exemploLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient() {

        Client client = new Client();
        client.setName("Iury");
        client.setLastName("Barros");
        client.setAge(18);

        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Iury");
        client.setLastName("Barros");
        client.setAge(18);

        Client client1 = new Client();
        client1.setName("Thiago");
        client1.setLastName("Cury");
        client1.setAge(36);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
