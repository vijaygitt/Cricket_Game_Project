package Repositories;

import Entities.Team;

import java.util.List;

public class TeamRepo{

    private static List<Team> teamList;

    public static List<Team> getTeamList() {
        return teamList;
    }

    public static void setTeamList(List<Team> teamList) {
        TeamRepo.teamList = teamList;
    }

    public static Team findByTeam(Integer teamId){
        for(Team team : teamList) {
            if (team.getId() == teamId)
                return team;
        }
        return null;
    }
}
