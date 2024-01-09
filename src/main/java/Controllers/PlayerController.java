package Controllers;

import Payloads.PlayerDto;
import Services.PlayerService;

public class PlayerController {

    PlayerService playerService;

    //creating a player initially by the admin
    public String createPlayer(String name, String type, String team){
        PlayerDto playerDto=new PlayerDto(name,type,team);
        boolean created =playerService.createPlayer(playerDto);
        return created?"Created" : " Could not create";
    }



    //for stats
    //show batting stats and bowling stats by mentioning and taking respective details

}
