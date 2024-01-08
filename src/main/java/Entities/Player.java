package Entities;

import Services.IdService;

public class Player {

    private int id;
    private String name;
    private String teamName;
    private PlayerStats playerStats;

    public Player(String name, String teamName) {
        this.id = IdService.createPlayerId();
        this.name = name;
        this.teamName = teamName;
        this.playerStats = new PlayerStats();
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }
}
