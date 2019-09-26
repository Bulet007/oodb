package com.company;

import java.util.List;

abstract class webside {
    private String name;

    private List<Landlord> workers;

    private List<Client> clients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Landlord> getLandlords() {
        return workers;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addLandlird(Landlord landlord) {
        if (!workers.contains(landlord)) {
            workers.add(landlord);
        }
    }

    public void addClient(Client client) {
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }
}
