package practice;

public class Armstrong {
	public static void main(String[] args) {
		
		for(int i=100;i<1000;i++)
		{
		
		int num = i;
		int temp = num;
		int sum = 0;
		while(num !=0)
		{
			int rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
			
		}
		
		if(sum==temp) {
			System.out.println(temp+" its armstrong");
		}
		else
		{
			//System.out.println(temp+" Not armstrong");
		}
		
		}
	}
}
