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
import java.util.HashMap;
import java.util.ArrayList;

/*
 * Collections are groups of OBJECTS
 * they can be stored in an ARRAY, SET, or QUEUE*/

public class CollectionTest {
	public static void main(String args[]) {
	
	ArrayList<String> team = new ArrayList<String>();
	team.add("Alpha");
	team.add("Bravo");
	team.add("Charlie");
	team.add("Delta");
	team.add("Echo");
	
	System.out.println("The members of team 2 are: " +team);
	System.out.println("There are "+team.size()+" people in team 2.");
	}
}

public class CollectionHashMap {
	public static void main(String[] args) {
		/* Declaration */
		HashMap<Integer, String> team2 = new HashMap<Integer, String>();
		/* Add elements */
		team2.put(4, "Alpha");
		team2.put(6, "Bravo");
		team2.put(1, "Charlie");
		team2.put(3, "Delta");
		team2.put(2, "Echo");
		
		System.out.println("Team 2 has "+team2.size()+" people in it.");
		
		/* Removing element by key */
		team2.remove(1);
		System.out.println(team2);
		
		/* Search for element by name */
		if(team2.containsKey("Delta")) {
			System.out.println("Element Found");
		}
		else {
			System.out.println("Element Missing");
		}
		/* Remove all elements from HashMap */
		team2.clear();
	}
}


	
	
	/*
	 *Iterable<String> team = Arrays.asList("Alpha","Bravo","Charlie","Delta","Echo");
	 *
	 *for (String name : team) {
	 *	System.out.println(name);
	 *}
	
	 */