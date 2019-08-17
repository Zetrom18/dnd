/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.lang.reflect.Method;
import javax.swing.text.StyleConstants;

/**
 *
 * @author lucas
 */
public class Character extends Entity {
    final User player;
    final java.lang.Class clss;
    final java.lang.Class race;    
    
    public Character(User usr, java.lang.Class r, java.lang.Class c){
        super();
        this.player = usr;
        this.race = r;
        this.clss = c;
    }
    
    public void TestCharacter(){
        super.setStr(this.randomizeStat());
        this.setDex(this.randomizeStat());
        this.setCon(this.randomizeStat());
        this.setInt(this.randomizeStat());
        this.setWis(this.randomizeStat());
        this.setCha(this.randomizeStat());
        this.setMaxHp(this.clss.getMethod("fstLvlHp", new java.lang.Class[]{int.class})(this.constitution));
    }

}
