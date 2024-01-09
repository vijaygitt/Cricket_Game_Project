package Entities;

import Services.IdService;

import java.util.List;

public class Team {

    private int id;
    private String name;
    private List<Integer> idOfPlayers;

    public Team(String name, List<Integer> idOfPlayers) {
        this.id = IdService.createTeamId();
        this.name = name;
        this.idOfPlayers = idOfPlayers;
    }

    public int getId() {
        return id;
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
