package array;

public class A002_Arrayoprations {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,5,6,89,45,6};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			//sum = sum+a[i];
			sum += a[i];
		}
		
		System.out.println("Sum : "+sum);
		System.out.println("avg : "+(sum/a.length));
		
		System.out.println("******************");
		
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
			
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		
		
		
	}
}
