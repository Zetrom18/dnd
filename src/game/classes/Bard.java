/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.classes;

import game.Dice;

/**
 *
 * @author lucas
 */
public abstract class Bard implements Class {
    
    public int hitDice(){
        return Dice.d8(1);
    }
    
    public int fstLvlHp(int conMod){
        return 8 + conMod;
    }
    
}
