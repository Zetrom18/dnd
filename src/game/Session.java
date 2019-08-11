/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Session {
    private Player master;
    private ArrayList<Player> players;
    
    Session (Player mstr){
        this.master = mstr;
        this.players = new ArrayList<Player>();
    }
    
    public void addPlayer(Player player){
        this.players.add(player);
    }
}
