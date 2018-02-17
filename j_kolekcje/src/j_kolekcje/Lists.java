package j_kolekcje;

import java.util.List;

public class Lists {
	
	public static long fill(List<Human> testList, int size)
	{
		long start = System.nanoTime();
		for(int i = 0; i < size; i++)
			testList.add(new Human( Randomizer.randomHeight() , Randomizer.randomFirstName() , Randomizer.randomSecondName() ) );
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long get(List<Human> testList, int testGet)
	{
		long start = System.nanoTime();
		testList.get( testGet );
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long contains(List<Human> testList, Human testContains)
	{
		long start = System.nanoTime();
		testList.contains ( testContains );
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long addRandom(List<Human> testList, Human testAddRandom, int index)
	{
		long start = System.nanoTime();
		testList.add(index, testAddRandom);
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long remove(List<Human> testList, int index)
	{
		long start = System.nanoTime();
		testList.remove(index);
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long printOut(List<Human> testList)
	{
		long start = System.nanoTime();
		for(Human x: testList)
			System.out.println("First name: " + x.getFirstName() + " second name: " + x.getSecondName() + " height: " + x.getHeight());
		long stop = System.nanoTime();
		return stop-start;
	}
}
