//Justin Mattix Weather Report
import java.util.Scanner;

public class Report 
{

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner (System.in);
		
		int F= cin.nextInt(); //F=Fahrenhiet
		if (F<=45) //condition for cold
		{
			System.out.println("That's Freezing!"); 
		}
		else if (F<=75) //condition for just right
		{
			System.out.println("That's just right");
		}
		else if (F>=76) //condition for hot
		{
			System.out.println("That's too hot!");
		}
		double ans=0; //subtrating and multiplying Fahrenheit to get Celsius
		ans= ((F-32) * 5.0 / 9);
		
		{
			System.out.println("The Temperature would be " + ans + " in Celsius"); //printing final answer
		}
		cin.close(); //closing program
		}

}
