package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.revature.models.Pokemon;

public class Launcher {
	//the java.util holds the collections framework
	//Collections hold references to other objects
	//Collections can change size dynamically
	
	//Pokemon object created from the Pokemon class
	Pokemon mypoke = new Pokemon("Nymph", "Water");
	
	
		
		public static void main(String[] args) {
			System.out.println("*******************ArrayList*******************");
			//ArrayList implement the List Interface
			List<Pokemon> myPokemon = new ArrayList<>();
			
			//.add method can add elements to your collection
			
			myPokemon.add(new Pokemon("Pikachu", "Electric"));
			myPokemon.add(new Pokemon("Squirtle", "Water"));
			myPokemon.add(new Pokemon("Ditto", "Normal"));
			myPokemon.add(new Pokemon("Mudkip", "Water/Ground"));
			myPokemon.add(new Pokemon("Turtwig", "Grass"));
			myPokemon.add(new Pokemon("Ditto", "Normal"));
			
			System.out.println(myPokemon);
			//will print out: //[Pokemon [name=Pikachu, type=Electric], Pokemon [name=Squirtle, type=Water], Pokemon [name=Ditto, type=Normal], Pokemon [name=Mudkip, type=Water/Ground], Pokemon [name=Turtwig, type=Grass]]
			System.out.println("__________________________________________");
			System.out.println("                                          ");
			
			for(Pokemon p: myPokemon) {
				System.out.println(p.name + " is " + p.type + " type!!!");
			}
			System.out.println("__________________________________________");
			System.out.println("                                          ");
			
			myPokemon.add(3, new Pokemon("Eevee", "Normal"));// add element at a certain index
			
			//.get(index) is how we specify a certain index in a list
			System.out.println("The Pokemon at index 3 is: " + myPokemon.get(3));
			System.out.println("__________________________________________");
			System.out.println("                                          ");
			
			//.size() is how we can get the number of elements in our list
			System.out.println("The amount of Pokemon in my party is: " + myPokemon.size());
			
			
			//creating two new Pokemon objects to experiment with
			Pokemon pikachu = new Pokemon("Pikachu", "Electric");
			Pokemon mewtwo = new Pokemon("Mewtwo", "Psychic");
			
			//.contains() checks if a certain element is in the List
			System.out.println(myPokemon.contains(pikachu));//true
			System.out.println(myPokemon.contains(mewtwo));//false
			System.out.println(myPokemon.contains(pikachu.name));//false
			System.out.println("__________________________________________");
			System.out.println("                                          ");
			
			//ForEach will loop through the entire collection and perform an action 
			//using a Lambda function (pokemon -> System.out.println(pokemon.name + " Attacked!!!")
			myPokemon.forEach(pokemon -> System.out.println(pokemon.name + " Attacked!!!"));
			System.out.println("__________________________________________");
			System.out.println("                                          ");

			
			//.remove() works two ways
				//1. will remove a specific element 
			   //2. will remove an element at a specific index
			myPokemon.remove(pikachu);
			myPokemon.remove(4);
			
			
			System.out.println("Two Pokemon have been removed");
			myPokemon.forEach(pokemon -> System.out.println(pokemon.name + " Remains!!!"));
			System.out.println("__________________________________________");
			System.out.println("                                          ");
			System.out.println("*******************SETS*******************");
			
			Set<Pokemon> myPokemonSet = new HashSet<>();//
			
			myPokemonSet.add(new Pokemon("Pikachu", "Electric"));
			myPokemonSet.add(new Pokemon("Squirtle", "Water"));
			myPokemonSet.add(new Pokemon("Ditto", "Normal"));
			myPokemonSet.add(new Pokemon("Mudkip", "Water/Ground"));
			myPokemonSet.add(new Pokemon("Turtwig", "Grass"));
			myPokemonSet.add(new Pokemon("Ditto", "Normal"));
			
			System.out.println(myPokemonSet);
			// no duplicate values will not get recorded
			// There is no guarantee that a set will be in any particular order
			
			System.out.println(myPokemonSet.contains(pikachu));//true
			System.out.println("__________________________________________");
			System.out.println("                                          ");
			System.out.println("*******************MAPS*******************");
			
			Map<String, Pokemon> trainers = new TreeMap<>();
			
			trainers.put("Joey", new Pokemon("Rattatta", "Normal"));
			trainers.put("Nancy", mewtwo);
			trainers.put("Stephen", myPokemon.get(3));
			
			System.out.println(trainers);
			System.out.println("__________________________________________");
			
			//Sort ArrayList by name
			Collections.sort(myPokemon, new ComparePokeName());//sort Array List based on the Comparator
			System.out.println("                                          ");
			System.out.println("*******************Comparator*******************");
			for(Pokemon p: myPokemon) {
				System.out.println(p);
			}
			
			System.out.println("__________________________________________");
			System.out.println("                                          ");
			System.out.println("*******************Comparator Reverse*******************");
			//Sort ArrayList by name
			Collections.reverse(myPokemon);
			
			for(Pokemon p: myPokemon) {
				System.out.println(p);
			}
		}
}
