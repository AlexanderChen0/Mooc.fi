/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexanderchen
 */
public class Player {
    private String player;
    private int goals;
    
    public Player(String player) {
        this.player = player;
        this.goals = 0;
        //Shorter version is this(player, 0);
    }

    public Player(String player, int goals) {
        this.player = player;
        this.goals = goals;
    }

    public String getName() {
        return player;
    }

    public int goals() {
        return goals;
    }

    @Override
    public String toString() {
        return "Player: " + player + ", goals " + goals; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
