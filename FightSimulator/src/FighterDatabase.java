import java.util.*;
import java.io.*;

public class FighterDatabase 
{
	private static ArrayList<Fighter> fighters;
	
	public FighterDatabase()
	{
		fighters = new ArrayList<Fighter>();
	}
	
	public static void readFighters() throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(new File("Fighters.txt")));
		String line;
		
		while((line = reader.readLine()) != null)
		{
			fighters.add(new Fighter(line.split(",")));
		}
	}
	
	public static void simulate(Fighter f1, Fighter f2)
	{
		if(!fighters.contains(f1) || !fighters.contains(f2))
		{
			System.out.println("Fighters not found. Try again.");
		}
		else
		{
			if(f1.getStrength() > f2.getStrength()) 
			{
				f1.upScore();
			}
			
			if(f1.getStrength() < f2.getStrength())
			{
				f2.upScore();
			}
			
			if(f1.getSpeed() > f2.getSpeed())
			{
				f1.upScore();
			}
			
			if(f1.getSpeed() < f2.getSpeed())
			{
				f2.upScore();
			}
			
			if(f1.getHax())
			{
				f1.setScore();
			}
			
			if(f2.getHax())
			{
				f2.setScore();
			}
		}
		
		String s = f1.getScore() > f2.getScore() ? f1.getName() : f2.getName();
		
		if(f1.getScore() == f2.getScore())
		{
			s = "Tie.";
		}
		System.out.println(s);
	}
	
	
}
