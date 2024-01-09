package Repositories;

import Entities.Team;
import Payloads.TeamDto;

import java.util.List;

public class TeamRepo{

    private List<Team> teamList;

    public List<Team> getTeamList() {
        return teamList;
    }

    public void save(Team team){
        this.teamList.add(team);
    }

    public Team findByTeam(Integer teamId){
        for(Team team : teamList) {
            if (team.getId() == teamId)
                return team;
        }
        return null;
    }
}
