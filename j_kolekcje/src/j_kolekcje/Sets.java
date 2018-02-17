package j_kolekcje;

import java.util.Set;

public class Sets {

	public static long fill(Set<Human> testSet, int size)
	{
		long start = System.nanoTime();
		for(int i = 0; i < size; i++)
		{
			Human tester = new Human( Randomizer.randomHeight() , Randomizer.randomFirstName() , Randomizer.randomSecondName() );
			testSet.add(tester);
		}
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long contains(Set<Human> testSet, Human testContains)
	{
		long start = System.nanoTime();
		testSet.contains( testContains );
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long addRandom(Set<Human> testSet, Human testAddRandom)
	{
		long start = System.nanoTime();
		testSet.add(testAddRandom);
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long remove(Set<Human> testSet, Human testRemove)
	{
		long start = System.nanoTime();
		testSet.remove(testRemove);
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long get(Set<Human> testSet, Human testGet)
	{
		long start = System.nanoTime();
		for(Human x: testSet)
			x.equals(testGet);
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long printOut(Set<Human> testSet)
	{
		long start = System.nanoTime();
		for(Human x: testSet)
			System.out.println("First name: " + x.getFirstName() + " second name: " + x.getSecondName() + " height: " + x.getHeight());
		long stop = System.nanoTime();
		return stop-start;
	}
}