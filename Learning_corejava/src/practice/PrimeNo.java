package practice;

public class PrimeNo {
	public static void main(String[] args) {
		
		
		int num = 15;
		int flag = 1;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag = 0;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
		
	}
}
