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
    private Person master;
    private ArrayList<Person> players;
    
    Session (Person mstr){
        this.master = mstr;
        this.players = new ArrayList<Person>();
    }
    
    public void addPlayer(Person player){
        this.players.add(player);
    }
}
