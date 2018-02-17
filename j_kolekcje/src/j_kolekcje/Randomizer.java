package j_kolekcje;

import java.util.Random;

public class Randomizer {

	public static int randomHeight()
	{
		Random generator = new Random();
		return generator.nextInt(60) + 150;
	}
	
	// Poniewaz celem programu jest tylko porownanie roznych typow kolekcji w jezyku java, pozwolilem sobie uzywac jako imion i nazwisko zlepkow losowych liter. Alternatywna metoda bylby import
	// imion i nazwisk z zewnetrznego pliku tekstowego
	public static String randomFirstName()
	{
		int length = (int)(Math.random()*12) + 3;
		char[] str = new char[30];
		for (int i = 0; i < length; i++)
		{
			str[i] = (char) (((int)(Math.random() * 26)) + (int)'a');
		}
		str[0] -= 32;
		return (new String(str, 0, length));	
	}
	
	public static String randomSecondName()
	{
		int length = (int)(Math.random()*12) + 3;
		char[] str = new char[30];
		for (int i = 0; i < length; i++)
		{
			str[i] = (char) (((int)(Math.random() * 26)) + (int)'a');
		}
		str[0] -= 32;
		return (new String(str, 0, length));	
	}
	
}
