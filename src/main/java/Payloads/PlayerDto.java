package Payloads;

import Entities.PlayerStats;

public class PlayerDto {

    private int id;
    private String name;
    private String type;
    private String teamName;
    private PlayerStats playerStats;

    public PlayerDto(String name, String type, String teamName) {
        this.name = name;
        this.type = type;
        this.teamName = teamName;
    }

    public PlayerDto(int id, String name, String type, String teamName) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.teamName = teamName;
    }

    public PlayerDto(int id, String name, String type, String teamName, PlayerStats playerStats) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.teamName = teamName;
        this.playerStats = playerStats;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
