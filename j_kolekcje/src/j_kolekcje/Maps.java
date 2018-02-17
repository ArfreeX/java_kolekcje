package j_kolekcje;

import java.util.Map;

public class Maps {
	
	public static long fill(Map<String , Human> testMap, int size)
	{
		long start = System.nanoTime();
		for(int i = 0; i < size; i++ )
		{
			Human tester = new Human( Randomizer.randomHeight() , Randomizer.randomFirstName() , Randomizer.randomSecondName() );
			testMap.put(tester.getSecondName(), tester);
		}
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long containsKey(Map<String , Human> testMap, Human testKey)
	{
		long start = System.nanoTime();
		testMap.containsKey( testKey.getSecondName() );
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long get(Map<String , Human> testMap, Human testGet)
	{
		long start = System.nanoTime();
		testMap.get( testGet.getSecondName() );
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long addRandom(Map<String , Human> testMap, Human testAddRandom)
	{
		long start = System.nanoTime();
		testMap.put(testAddRandom.getSecondName(), testAddRandom);
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long remove(Map<String, Human> testMap, Human testRemove)
	{
		long start = System.nanoTime();
		testMap.remove(testRemove.getSecondName());
		long stop = System.nanoTime();
		return stop-start;
	}
	
	public static long printOut(Map<String , Human> testMap)
	{
		long start = System.nanoTime();
		for(String x: testMap.keySet())
			System.out.println("First name: " + testMap.get(x).getFirstName() + " second name: " + x + " height: " + testMap.get(x).getHeight());
		long stop = System.nanoTime();
		return stop-start;
	}
}
