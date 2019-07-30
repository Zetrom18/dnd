/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author lucas
 */
public abstract class Entity {
    private int maximumHealthPoints;
    private int healthPoints;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    
    Entity(
            int maxHp,
            int str,
            int dex,
            int con,
            int intl,
            int wis,
            int cha
    ){
        this.maximumHealthPoints = maxHp;
        this.healthPoints = maximumHealthPoints;
        this.strength = str;
        this.dexterity = dex;
        this.constitution = con;
        this.intelligence = intl;
        this.wisdom = wis;
        this.charisma = cha;
    }
    
    private static int getModifier(
            int value
    ){
        return (value/2)-5;
    }
}
