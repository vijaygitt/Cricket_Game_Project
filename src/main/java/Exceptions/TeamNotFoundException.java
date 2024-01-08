package Exceptions;

public class TeamNotFoundException extends RuntimeException{
    public TeamNotFoundException(int teamId){
        super(String.format("No team with team Id "+teamId+" exists. Please enter the correct team Id"));
    }
}
