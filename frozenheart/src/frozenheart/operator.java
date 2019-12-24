package frozenheart;
import java.util.Scanner;
public class operator {

	public static void main (String args[])
	{

		int day;
		
		System.out.print("Enter a day :");
		Scanner x = new Scanner(System.in);
		day = x.nextInt();
		
		
		switch (day)
		{
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
			
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thurday");
			break;
			
		case 5:
			System.out.println("Today is Friday");
			break;
			
		case 6:
			System.out.println("Today is Saturday");
			break;
			
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Invalid  input");
		}
		
		// ------------------------:)---------------
		
	
		
		
		
		
	}
	
	
}
