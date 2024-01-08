package Entities;

import Services.IdService;

import java.util.List;

public class Team {

    private int id;
    private String name;
    private List<Player> players;

    public Team(String name, List<Player> players) {
        this.id = IdService.createTeamId();
        this.name = name;
        this.players = players;
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

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
