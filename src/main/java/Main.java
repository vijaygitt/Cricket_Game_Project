import Controllers.PlayerController;
import Controllers.TeamController;
import Payloads.PlayerDto;
import Repositories.PlayerRepo;
import Repositories.TeamRepo;
import Services.Implementation.PlayerServiceImpl;
import Services.Implementation.TeamServiceImpl;
import Services.PlayerService;
import Services.TeamService;
import org.modelmapper.ModelMapper;

import java.util.List;

public class Main {
    public static void main(String[] args){
        ModelMapper modelMapper=new ModelMapper();
        PlayerRepo playerRepo=new PlayerRepo();
        TeamRepo teamRepo=new TeamRepo();
        PlayerService playerService=new PlayerServiceImpl(modelMapper,playerRepo);
        TeamService teamService=new TeamServiceImpl(modelMapper,teamRepo);

        PlayerController playerController=new PlayerController(playerService);
        System.out.println(playerController.createPlayer("Virat Kohli","Batsman","India"));
        System.out.println(playerController.createPlayer("Rohit Sharma","Batsman","India"));

        TeamController teamController=new TeamController(teamService,playerService);
        List<PlayerDto> list= List.of(new PlayerDto("KL Rahul","Batsman","India")
                ,new PlayerDto("Hardik Pandya","Bowler","India")
                ,new PlayerDto("Ravinder Jadeja","Bowler","India")
                ,new PlayerDto("Surya Kumar Yadav","Batsman","India")
                ,new PlayerDto("Jasprit Bumrah","Bowler","India")
                ,new PlayerDto("Shubhman Gill","Batsman","India")
                ,new PlayerDto("Kuldeep Yadav","Bowler","India")
                ,new PlayerDto("Rinku Singh","Batsman","India"));
        System.out.println(teamController.createTeam("India",list));
        //playerRepo.getPlayers();

    }
}
