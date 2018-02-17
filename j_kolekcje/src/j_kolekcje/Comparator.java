package j_kolekcje;

import java.util.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;



public class Comparator {
	
	public static void compare(int size)
	{
		
		int index = (int)(Math.random() * size);
		int indexR = (int)(Math.random() * size);
		Human test = new Human( Randomizer.randomHeight() , Randomizer.randomFirstName() , Randomizer.randomSecondName() );
		
		List<Human> firstList = new ArrayList<Human>();
		List<Human> secondList = new LinkedList<Human>();
		
		Set<Human> setWithNames = new HashSet<>();
		Set<Human> setWithNamesTree = new TreeSet<>();
		
		Map<String, Human> pairsMap = new HashMap<>();
		Map<String, Human> pairsMapTree = new TreeMap<>();
		System.out.println(
				"\nFilling up collections: " 
				+ "\nArrayList: " + Lists.fill(firstList, size) + " ns" 
				+ "\nLinkedList: " + Lists.fill(secondList, size) + " ns"
				+ "\nHashSet: " + Sets.fill(setWithNames, size) + " ns"
				+ "\nTreeSet: " + Sets.fill(setWithNamesTree, size) + " ns"
				+ "\nHashMap: " + Maps.fill(pairsMap, size) + " ns"
				+ "\nTreeMap: " + Maps.fill(pairsMapTree, size) + " ns"
				);
		
		System.out.println(
				"\nPrinting out collections: " 
				+ "\nArrayList: " + Lists.printOut(firstList) + " ns" 
				+ "\nLinkedList: " + Lists.printOut(secondList) + " ns"
				+ "\nHashSet: " + Sets.printOut(setWithNames) + " ns"
				+ "\nTreeSet: " + Sets.printOut(setWithNamesTree) + " ns"
				+ "\nHashMap: " + Maps.printOut(pairsMap) + " ns"
				+ "\nTreeMap: " + Maps.printOut(pairsMapTree) + " ns"
				);
		
		System.out.println(
				"\nAdding to collection: " 
				+ "\nArrayList: " + Lists.addRandom(firstList, test, index) + " ns" 
				+ "\nLinkedList: " + Lists.addRandom(secondList, test, index) + " ns"
				+ "\nHashSet: " + Sets.addRandom(setWithNames, test) + " ns"
				+ "\nTreeSet: " + Sets.addRandom(setWithNamesTree, test) + " ns"
				+ "\nHashMap: " + Maps.addRandom(pairsMap, test) + " ns"
				+ "\nTreeMap: " + Maps.addRandom(pairsMapTree, test) + " ns"
				);
		System.out.println(
				"\nRemove from collection: " 
				+ "\nArrayList: " + Lists.remove(firstList, indexR) + " ns" 
				+ "\nLinkedList: " + Lists.remove(secondList, indexR) + " ns"
				+ "\nHashSet: " + Sets.remove(setWithNames, test) + " ns"
				+ "\nTreeSet: " + Sets.remove(setWithNamesTree, test) + " ns"
				+ "\nHashMap: " + Maps.remove(pairsMap, test) + " ns"
				+ "\nTreeMap: " + Maps.remove(pairsMapTree, test) + " ns"
				);
		System.out.println(
				"\nContains: " 
				+ "\nArrayList: " + Lists.contains(firstList, test) + " ns" 
				+ "\nLinkedList: " + Lists.contains(secondList, test) + " ns"
				+ "\nHashSet: " + Sets.contains(setWithNames, test) + " ns"
				+ "\nTreeSet: " + Sets.contains(setWithNamesTree, test) + " ns"
				+ "\nHashMap: " + Maps.containsKey(pairsMap, test) + " ns"
				+ "\nTreeMap: " + Maps.containsKey(pairsMapTree, test) + " ns"
				);
		System.out.println(
				"\nGet: " 
				+ "\nArrayList: " + Lists.get(firstList, index) + " ns" 
				+ "\nLinkedList: " + Lists.get(secondList, index) + " ns"
				+ "\nHashSet: " + Sets.get(setWithNames, test) + " ns"
				+ "\nTreeSet: " + Sets.get(setWithNamesTree, test) + " ns"
				+ "\nHashMap: " + Maps.get(pairsMap, test) + " ns"
				+ "\nTreeMap: " + Maps.get(pairsMapTree, test) + " ns"
				);
		
	}
	
	public static void runCompare()
	{
		int size=200000; // value of size should be in the range of < 1 ; 2 000 000 >
		compare(size);
	}
 
}
