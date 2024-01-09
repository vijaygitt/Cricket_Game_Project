package Services.Implementation;

import Entities.Player;
import Entities.Team;
import Exceptions.TeamNotFoundException;
import Payloads.TeamDto;
import Repositories.TeamRepo;
import Services.IdService;
import Services.TeamService;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TeamServiceImpl implements TeamService {

    private final ModelMapper modelMapper;
    private final TeamRepo teamRepo;

    public TeamServiceImpl(ModelMapper modelMapper, TeamRepo teamRepo) {
        this.modelMapper = modelMapper;
        this.teamRepo = teamRepo;
    }

    @Override
    public Integer createTeam(TeamDto teamDto) {
        Team team=modelMapper.map(teamDto,Team.class);
        team.setId(IdService.createTeamId());
        this.teamRepo.save(team);

        return team.getId();
    }

    //@Override
    //public Map<Integer,String> getplayers(Integer teamId) throws TeamNotFoundException {

    //}
}
