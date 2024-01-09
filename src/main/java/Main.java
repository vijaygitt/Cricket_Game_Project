import Controllers.PlayerController;
import Controllers.TeamController;
import Repositories.PlayerRepo;
import Services.Implementation.PlayerServiceImpl;
import Services.PlayerService;
import org.modelmapper.ModelMapper;

public class Main {
    public static void main(String[] args){
        ModelMapper modelMapper=new ModelMapper();
        PlayerRepo playerRepo=new PlayerRepo();
        PlayerService playerService=new PlayerServiceImpl(modelMapper,playerRepo);

        PlayerController playerController=new PlayerController(playerService);
        System.out.println(playerController.createPlayer("Virat","Batsman","India"));
        System.out.println(playerController.createPlayer("Rohit","Batsman","India"));
        //playerRepo.getPlayers();

    }
}
