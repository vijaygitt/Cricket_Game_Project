package Controllers;

import Entities.Match;
import Repositories.TeamRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchController {

    List<Integer> teamIds;
    Match match;
    public MatchController(){
        System.out.println("Choose the Teams for the Match by entering their Ids");
        System.out.println(TeamRepo.getTeamList().stream().filter(team -> team.getId()));
        Scanner sc=new Scanner(System.in);
        teamIds.add(sc.nextInt());
        teamIds.add(sc.nextInt());

    }
    public List<List<String>> createMatch(List<Integer> teamIds){
        this.teamIds=teamIds;
        match=new Match(teamIds);
        List<List<String>> playersOfBothTeam=new ArrayList<>();

    }
}
