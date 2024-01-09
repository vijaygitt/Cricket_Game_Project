package Services;

import Entities.Player;

import java.util.List;

public interface TeamService {

    // access for creating team will only be with admin
    public void createTeam(String teamName, List<String> players);

    public List<Player> getplayers(java.lang.Integer teamId);

}
