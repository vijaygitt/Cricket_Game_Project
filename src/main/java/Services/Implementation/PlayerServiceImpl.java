package Services.Implementation;

import Entities.Player;
import Payloads.PlayerDto;
import Repositories.PlayerRepo;
import Services.PlayerService;
import org.modelmapper.ModelMapper;

public class PlayerServiceImpl implements PlayerService {



    private final ModelMapper modelMapper=new ModelMapper();
    private final PlayerRepo playerRepo;

    PlayerServiceImpl(PlayerRepo playerRepo){
        this.playerRepo=playerRepo;
    }

    @Override
    public boolean createPlayer(PlayerDto playerDto) {
        Player player=modelMapper.map(playerDto,Player.class);
        this.playerRepo.save(player);
        return true;
    }
}
