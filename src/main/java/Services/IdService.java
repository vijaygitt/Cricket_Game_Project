package Services;

public class IdService {

    private static int playerCounter=1;
    private static int teamCounter=1;


    public static int createPlayerId(){
        return playerCounter++;
    }

    public static int createTeamId(){
        return teamCounter++;
    }


}
