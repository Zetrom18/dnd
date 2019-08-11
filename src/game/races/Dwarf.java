/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.races;

import java.util.*; 

/**
 *
 * @author lucas
 */
public abstract class Dwarf implements Race {
    
    public String randomMaleName(){
        final ArrayList<String> list = new ArrayList<String>(
                Arrays.asList(
                        "Adrik",
                        "Alberich",
                        "Baern",
                        "Barendd",
                        "Brottor",
                        "Bruenor",
                        "Dain",
                        "Darrak",
                        "Delg",
                        "Eberk",
                        "Einkil",
                        "Fargrim",
                        "Flint",
                        "Gardain",
                        "Harbek",
                        "Kildrak",
                        "Morgan",
                        "Orsik",
                        "Oskar",
                        "Rangrim",
                        "Rurik",
                        "Raklinn",
                        "Thoradin",
                        "Thorin",
                        "Tordek",
                        "Traubon",
                        "Travok",
                        "Ulfgar",
                        "Veit",
                        "Vondal"
                )
        );
        return list.get(new Random().nextInt(list.size()));
    }

    public String randomFemaleName(){
        final ArrayList<String> list = new ArrayList<String>(
                Arrays.asList(
                        "Amber",
                        "Artin",
                        "Audhild",
                        "Bardryn",
                        "Dagnal",
                        "Diesa",
                        "Eldeth",
                        "Falkrunn",
                        "Finellen",
                        "Gunnloda",
                        "Gurdis",
                        "Helja",
                        "Hlin",
                        "Kathra",
                        "Kristryd",
                        "Ilde",
                        "Liftrasa",
                        "Mardred",
                        "Riswynn",
                        "Sannl",
                        "Torbera",
                        "Torgga",
                        "Vistra"
                )
        );
        return list.get(new Random().nextInt(list.size()));
    }
    
    public String randomLastName(){
        final ArrayList<String> list = new ArrayList<String>(
                Arrays.asList(
                        "Balderk",
                        "Battlehammer",
                        "Brawnanvil",
                        "Dankil",
                        "Fireforge",
                        "Frostbeard",
                        "Gorunn",
                        "Holderhek",
                        "Ironfist",
                        "Loderr",
                        "Lutgehr",
                        "Rumnaheim",
                        "Strakeln",
                        "Torunn",
                        "Ungart"
                )
        );
        return list.get(new Random().nextInt(list.size()));
    }
    
    public int speed(){
        return 25;
    }

}
