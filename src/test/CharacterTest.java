/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import game.User;
import game.Character;

import java.util.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class CharacterTest {
    
    public static void RandomCharacterTests(User usr, int iterations){
        System.out.printf("Starting %d random iteration(s) of character creation...\n", iterations);

        Random rand = new Random();
        final ArrayList<String> classList = new ArrayList<String>(Arrays.asList("Bard", "Test"));
        final ArrayList<String> raceList = new ArrayList<String>(Arrays.asList("Dwarf", "Test"));
          
        for(int i=0; i<iterations; i++){
            
            final String className = classList.get(rand.nextInt(classList.size()));
            final String raceName = raceList.get(rand.nextInt(raceList.size()));

            System.out.printf("Creating %s %s character...\n", raceName, className);

            try {
            
                Character charTest = new Character(usr, Class.forName("game.races." + raceName), Class.forName("game.classes." + className));
                charTest.TestCharacter();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CharacterTest.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.println("Class/Race not found, skipping iteration...");
                continue;
            }

            System.out.println("Character created.");
    
        }

        System.out.println("Creation done.");

    }

    public static void main(String[] args) {
        
        System.out.println("Creating test user...");
        final User usr = new User("test", "test", "tst");
        System.out.println("User created.");
        
        RandomCharacterTests(usr, 10);
    }
}
