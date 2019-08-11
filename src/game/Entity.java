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
            int str,
            int dex,
            int con,
            int intl,
            int wis,
            int cha
    ){
        this.maximumHealthPoints = 1;
        this.healthPoints = maximumHealthPoints;
        this.strength = str;
        this.dexterity = dex;
        this.constitution = con;
        this.intelligence = intl;
        this.wisdom = wis;
        this.charisma = cha;
    }
    
    private int getModifier(
            int value
    ){
        return (value/2)-5;
    }
    
    public int rollStr(){
        return Dice.d20(1) + getModifier(this.strength);
    }
    
    public int rollStr(int plus){
        return Dice.d20(1) + getModifier(this.strength) + plus;
    }
    
    public int rollDex(){
        return Dice.d20(1) + getModifier(this.dexterity);
    }
    
    public int rollDex(int plus){
        return Dice.d20(1) + getModifier(this.dexterity) + plus;
    }
    
    public int rollCon(){
        return Dice.d20(1) + getModifier(this.constitution);
    }
    
    public int rollCon(int plus){
        return Dice.d20(1) + getModifier(this.constitution) + plus;
    }
    
    public int rollInt(){
        return Dice.d20(1) + getModifier(this.intelligence);
    }
    
    public int rollInt(int plus){
        return Dice.d20(1) + getModifier(this.intelligence) + plus;
    }
    
    public int rollWis(){
        return Dice.d20(1) + getModifier(this.wisdom);
    }
    
    public int rollWis(int plus){
        return Dice.d20(1) + getModifier(this.wisdom) + plus;
    }
    
    public int rollCha(){
        return Dice.d20(1) + getModifier(this.charisma);
    }
    
    public int rollCha(int plus){
        return Dice.d20(1) + getModifier(this.charisma) + plus;
    }
}
