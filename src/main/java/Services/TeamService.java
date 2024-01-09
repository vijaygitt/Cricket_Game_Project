package Services;

import Entities.Player;
import Payloads.TeamDto;

import java.util.List;

public interface TeamService {

    // access for creating team will only be with admin
    public Integer createTeam(TeamDto teamDto);

    //public List<Player> getplayers(Integer teamId);

}
