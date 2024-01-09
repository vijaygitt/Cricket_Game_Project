package Entities;

import java.util.List;

public class Match {

    private List<java.lang.Integer> idOfPlayingTeams;
    private List<Player> playersOfTeam1;
    private List<Player> playersOfTeam2;

    public Match(List<java.lang.Integer> idOfPlayingTeams) {
        this.idOfPlayingTeams=idOfPlayingTeams;
    }

    public List<java.lang.Integer> getIdOfPlayingTeams() {
        return idOfPlayingTeams;
    }

    public void setIdOfPlayingTeams(List<java.lang.Integer> idOfPlayingTeams) {
        this.idOfPlayingTeams=idOfPlayingTeams;
    }

    public List<Player> getPlayersOfTeam1() {
        return playersOfTeam1;
    }

    public void setPlayersOfTeam1(List<Player> playersOfTeam1) {
        this.playersOfTeam1 = playersOfTeam1;
    }

    public List<Player> getPlayersOfTeam2() {
        return playersOfTeam2;
    }

    public void setPlayersOfTeam2(List<Player> playersOfTeam2) {
        this.playersOfTeam2 = playersOfTeam2;
    }
}
