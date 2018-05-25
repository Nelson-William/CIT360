/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.HashMap;

/**
 *
 * @author willnelson
 */
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