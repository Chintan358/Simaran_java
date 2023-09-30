package pettern;

public class P8 {
	public static void main(String[] args) {
		
		int lines = 9;
		int startCount = 1;
		int spaceCount = lines-1;
		int mid = (lines/2)+1;
		
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			
			for (int i = 1; i <=startCount; i++) 
			{
				if(i==1 || i==startCount)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if(j<mid)
			{
				startCount = startCount+2;
				spaceCount--;
			}
			else
			{
				startCount = startCount-2;
				spaceCount++;
			}
		}
		
		
		
	}
}
