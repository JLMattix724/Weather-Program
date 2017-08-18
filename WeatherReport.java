public class Report 
{

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner (System.in);
		
		int F= cin.nextInt(); //F=Fahrenhiet
		if (F<=45)
		{
			System.out.println("That's Freezing!");
		}
		else if (F<=75)
		{
			System.out.println("That's just right");
		}
		else if (F>=76)
		{
			System.out.println("That's too hot!");
		}
		double ans=0;
		ans= ((F-32) * 5.0 / 9);
		
		{
			System.out.println("The Temperature would be " + ans + " in Celsius");
		}
		cin.close();
		}

}
