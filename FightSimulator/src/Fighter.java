import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fighter 
{
	private String[] data;
	private int score;
	private double strength, speed;
	private boolean hax;
	private String name;
	
	public Fighter(String[] data)
	{
		this.data = data;
		name = data[0];
		strength = Double.parseDouble(data[1]);
		speed = Double.parseDouble(data[2]);
		hax = Boolean.parseBoolean(data[3]);
		score = 0;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void upScore()
	{
		score++;
	}
	
	public void downScore()
	{
		score--;
	}
	
	public void setScore()
	{
		score = (int) Math.pow(score, 3);
	}
	
	public double getStrength()
	{
		return strength;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public boolean getHax()
	{
		return hax;
	}
	
	public String getName()
	{
		return name;
	}

	public String[] getData()
	{
		return data;
	}

	

	
	
}
