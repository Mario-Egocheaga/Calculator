import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Value");
		Scanner sc = new Scanner(System.in);
		float operand1 = sc.nextFloat();
		System.out.println("Enter a Value");
		float operand2 = sc.nextFloat();
		
		System.out.println("Would you like to add, subtract, multiply, or divide?");
		String option = sc.next().toLowerCase();
		
		if(option.equals("add"))
		{
			System.out.println(operand1 + operand2);
		}
		else if (option.equals("subtract"))
		{
			System.out.println(operand1 - operand2);
			
		}
		
		else if(option.equals("multiply"))
		{
			System.out.println(operand1 * operand2);
			
		}
		else if (option.equals("divide"))
		{
			if(operand1 != 0 || operand2 !=0)
			{
				System.out.println(operand1 / operand2);
			}
			else 
			{
				System.out.println("Error: Divide by Zero");
			}
		}
		

	}

}
