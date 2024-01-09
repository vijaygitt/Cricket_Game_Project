package Services.Implementation;

import Entities.Player;
import Entities.Team;
import Repositories.TeamRepo;
import Services.TeamService;
import java.util.List;
import java.util.Optional;

public class TeamServiceImpl implements TeamService {


    @Override
    public void createTeam(String teamName, List<String> players) {

    }

    @Override
    public List<Player> getplayers(java.lang.Integer teamId) throws TeamNotFoundException {
        Optional<Team> team=Optional.ofNullable(TeamRepo.findByTeam(teamId)).orElseThrow(()->new TeamNotFoundException(teamId));
    }
}
