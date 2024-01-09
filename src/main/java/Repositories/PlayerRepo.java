package Repositories;

import Entities.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepo {

    List<Player> playerList=new ArrayList<>();

    public void save(Player player) {
        playerList.add(player);
    }
}
