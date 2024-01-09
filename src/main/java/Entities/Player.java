package Entities;

import Services.IdService;

public class Player {

    private int id;
    private String name;
    private String type;
    private String teamName;
    private PlayerStats playerStats;

    public Player(String name,String type, String teamName) {
        this.id = IdService.createPlayerId();
        this.name = name;
        this.type=type;
        this.teamName = teamName;
        this.playerStats = new PlayerStats();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public PlayerStats getPlayerStats() {
        return this.playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }
}
