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
public class Character extends Entity {

    Character(
            int maxHp,
            int str,
            int dex,
            int con,
            int intl,
            int wis,
            int cha
    ){
        super(maxHp, str, dex, con, intl, wis, cha);
    }
}
