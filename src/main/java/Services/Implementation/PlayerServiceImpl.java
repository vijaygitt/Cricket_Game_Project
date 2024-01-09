package Services.Implementation;

import Entities.Player;
import Entities.PlayerStats;
import Payloads.PlayerDto;
import Repositories.PlayerRepo;
import Services.IdService;
import Services.PlayerService;
import org.modelmapper.ModelMapper;

public class PlayerServiceImpl implements PlayerService {



    private final ModelMapper modelMapper;
    private final PlayerRepo playerRepo;

    public PlayerServiceImpl(ModelMapper modelMapper, PlayerRepo playerRepo) {
        this.modelMapper = modelMapper;
        this.playerRepo = playerRepo;
    }


    @Override
    public Integer createPlayer(PlayerDto playerDto) {
        Player player=modelMapper.map(playerDto,Player.class);
        player.setId(IdService.createPlayerId());
        player.setPlayerStats(new PlayerStats());
        this.playerRepo.save(player);
        return player.getId();
    }
}
