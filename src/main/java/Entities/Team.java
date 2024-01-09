package Entities;

import Services.IdService;

import java.util.List;

public class Team {

    private int id;
    private String name;
    private List<Integer> idOfPlayers;


    Team(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getIdOfPlayers() {
        return idOfPlayers;
    }

    public void setIdOfPlayers(List<Integer> idOfPlayers) {
        this.idOfPlayers = idOfPlayers;
    }
}
