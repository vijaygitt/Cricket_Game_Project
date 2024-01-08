package Services;

public class IdService {

    private static int playerCounter=0;
    private static int teamCounter=0;


    public static int createPlayerId(){
        return playerCounter++;
    }

    public static int createTeamId(){
        return teamCounter++;
    }


}
