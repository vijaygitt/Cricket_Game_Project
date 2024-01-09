package Repositories;

import Entities.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepo {

    List<Player> playerList=new ArrayList<>();

    public void save(Player player) {
        playerList.add(player);
    }

   /* this is for testing
    public void getPlayers(){
        playerList.stream().forEach(player->System.out.println(player.getId()+" "+player.getName()+" "+player.getTeamName()+" "+player.getPlayerStats()));
    }*/
}
