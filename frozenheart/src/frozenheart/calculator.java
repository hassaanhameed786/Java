package frozenheart;
import java.util.Scanner;
public class calculator {
public static void main (String args[]) {
	
	Scanner input = new Scanner(System.in);
	
	//variables for the basic calcultor /
	double num1, num2 ,answer;
	
	System.out.print("Enter a first number :");
	num1 = input.nextDouble();
	
	System.out.print("Enter a second number : ");
	num2 = input.nextDouble();
	
	System.out.print("the result of 2 intergers is :");
	answer = num1 + num2;
	System.out.print(answer);
	
	
	
	
	
	
}
}
