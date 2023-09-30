package pettern;

public class P12 {
	public static void main(String[] args) {
		
		
			for(int j=1;j<=5;j++)
			{
				for (int i = 1; i <=j; i++) 
				{
					if(i%2 == j%2)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}
				System.out.println();
			}
		
		
	}
}
