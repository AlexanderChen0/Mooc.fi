
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexanderchen
 */
public class Team {
    private String team;
    private ArrayList<Player> playersList;
    private int maxSize;
    
    public Team(String name){
        team = name;
        maxSize = 16;
        playersList = new ArrayList<Player>();
    }

    public int size() {
        return playersList.size();
    }
    
    public void setMaxSize(int size){
        maxSize = size;
    }
    
    public void addPlayer(Player name){
        if(playersList.size() < maxSize)playersList.add(name);
    }
    
    public int goals(){
        int totalGoals = 0;
        for(Player player : playersList) totalGoals += player.goals();
        return totalGoals;
    }
    
    public void printPlayers(){
        for(Player name : playersList){
            System.out.println(name.getName() + ", goals " + name.goals());
        }
    }

    public String getName() {
        return team;
    }
}
