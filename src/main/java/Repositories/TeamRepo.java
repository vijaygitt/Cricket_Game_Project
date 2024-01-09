package Repositories;

import Entities.Team;
import Payloads.TeamDto;

import java.util.ArrayList;
import java.util.List;

public class TeamRepo{

    List<Team> teamList=new ArrayList<>();

    public List<Team> getTeamList() {
        return teamList;
    }

    public void save(Team team){
        teamList.add(team);
    }

    public Team findByTeam(Integer teamId){
        for(Team team : teamList) {
            if (team.getId() == teamId)
                return team;
        }
        return null;
    }
}
