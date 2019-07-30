/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Dice {
    
    private static int roll(
            int die
    ){
        final Random rand = new Random();
        return rand.nextInt(die)+1;
    }
    
    private static int xdy(
            int x,
            int y
    ){
        int sum = 0;
        for(int i = 0; i < x; i++){
            sum += roll(y);
        }
       return sum;
    }
    
    public static int d4(
            int x
    ){
        return xdy(x, 4);
    }
    
    public static int d6(
            int x
    ){
        return xdy(x, 6);
    }
    
    public static int d8(
            int x
    ){
        return xdy(x, 8);
    }
    
    public static int d10(
            int x
    ){
        return xdy(x, 10);
    }
    
    public static int d12(
            int x
    ){
        return xdy(x, 12);
    }
    
    public static int d20(
            int x
    ){
        return xdy(x, 20);
    }
}
