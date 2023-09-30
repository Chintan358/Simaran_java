package statements;

import java.util.Scanner;

public class S003_Calc {
	public static void main(String[] args) {
		
		String choice;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int b = sc.nextInt();
		System.out.println("Enter choice : ");
		System.out.println("1:add, 2:sub, 3:div, 4:Mul, 5:exit");
		 choice = sc.next();
		
		
		if(choice.equals("add"))
		{
			System.out.println("Addition is : "+(a+b));
		}
		else if(choice.equals("sub"))
		{
			System.out.println("Substraction is : "+(a-b));
		}
		else if(choice.equals("div"))
		{
			System.out.println("division is : "+(a/b));
		}
		else if(choice.equals("mul"))
		{
			System.out.println("Multiplication is : "+(a*b));
		}
		else if(choice.equals("exit"))
		{
			System.out.println("Exit!!!!");
		}
		else
		{
			System.out.println("Invalid choice !!!");
		}
		}while(!choice.equals("exit"));
	}
}
