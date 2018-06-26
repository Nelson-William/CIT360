/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author willnelson
 */
public class CollectionSets {
    
    public static void main(String[] args){
        Set<String> team = new HashSet<String>();
        //Add items to the list
        team.add("Alpha");
	team.add("Bravo");
	team.add("Charlie");
	team.add("Delta");
	team.add("Echo");
        //Add duplicate items to the list
        team.add("Alpha");
	team.add("Bravo");
	team.add("Charlie");
	team.add("Delta");
	team.add("Echo");
        
        //Sets do not allow duplicates, and printing out the set will remove them
        System.out.println(team);
    }
    
}
