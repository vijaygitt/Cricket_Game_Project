package Controllers;

import Entities.Player;
import Payloads.PlayerDto;
import Payloads.TeamDto;
import Services.PlayerService;
import Services.TeamService;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class TeamController {

    TeamService teamService;
    PlayerService playerService;
    ModelMapper modelMapper;



    //this will be accessed only by the admin
    //may or maynot create player here, if no player to be made here, just pass an empty list
    public String createTeam(String name, List<PlayerDto> playerDtoList){

       List<Integer> playerIds= playerDtoList.stream().map(playerDto-> playerService.createPlayer(playerDto))
               .collect(Collectors.toList());
       TeamDto teamDto=new TeamDto(name,playerIds);
       Integer createdTeamId= this.teamService.createTeam(teamDto);
        return "Created the team with Id "+createdTeamId;
    }

}
