/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author willnelson
 */
public class CollectionTree {
    public static void main(String[] args){
        Set<String> team = new HashSet<>();
        //Add items to the list
        team.add("Zulu");
        team.add("Echo");
        team.add("Alpha");
        team.add("Xray");
	team.add("Delta");
	team.add("Charlie");
	team.add("Tango");
	team.add("Bravo");
        
        //Print out the team list
        System.out.println(team);
        
        //Create a TreeList, which will re-order the team alphabetically.
        Set<String> treeSet = new TreeSet<>(team);
        
        //Print out the new team list
        System.out.println(treeSet);
    }   
}
