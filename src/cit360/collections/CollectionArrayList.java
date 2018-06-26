/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

/**
 *
 * @author willnelson
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collections are groups of OBJECTS
 * they can be stored in an ARRAY, SET, or QUEUE*/

public class CollectionArrayList {
	public static void main(String args[]) {
	
	ArrayList<String> team = new ArrayList<String>();
	//Add items to the ArrayList
        team.add("Alpha");
	team.add("Bravo");
	team.add("Charlie");
	team.add("Delta");
	team.add("Echo");
	
        //Print out contents of ArrayList, and show size
	System.out.println("The members of team 2 are: " +team);
	System.out.println("There are "+team.size()+" people in team 2.");
        
        //Iterating through the list
        Iterator<String> iterator = team.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            }
        }
        
        
}