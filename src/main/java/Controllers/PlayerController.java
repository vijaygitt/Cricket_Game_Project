package Controllers;

import Payloads.PlayerDto;
import Services.PlayerService;

public class PlayerController {

    PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService=playerService;
    }

    //creating a player initially by the admin
    public String createPlayer(String name, String type, String team){
        PlayerDto playerDto=new PlayerDto(name,type,team);
        Integer createdId =playerService.createPlayer(playerDto);
        return "Player created with Player Id "+createdId;
    }



    //for stats
    //show batting stats and bowling stats by mentioning and taking respective details

}
