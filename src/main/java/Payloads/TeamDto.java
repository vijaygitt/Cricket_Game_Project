package Payloads;

import java.util.List;

public class TeamDto {

    private int id;
    private String name;
    private List<Integer> idOfPlayers;

    public TeamDto(String name, List<Integer> idOfPlayers) {
        this.name = name;
        this.idOfPlayers = idOfPlayers;
    }

    public TeamDto(int id, String name, List<Integer> idOfPlayers) {
        this.id = id;
        this.name = name;
        this.idOfPlayers = idOfPlayers;
    }

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
