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
    private User master;
    private ArrayList<User> players;
    
    Session (User mstr){
        this.master = mstr;
        this.players = new ArrayList<User>();
    }
    
    public void addPlayer(User player){
        this.players.add(player);
    }
}
