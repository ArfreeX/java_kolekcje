package j_kolekcje;


public class Human implements Comparable<Human>{
	
	private int height;
	private String firstName;
	private String secondName;
	
	public Human(int height, String firstName, String secondName)
	{
		this.height = height;
		this.firstName = firstName;
		this.secondName = secondName;
	} 
	
	
	public int getHeight()
	{
		return height;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getSecondName()
	{
		return secondName;
	}


	@Override
	public int compareTo(Human arg0) {
		return height-arg0.height;
	}
	
}