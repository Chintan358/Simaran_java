package array;

public class A003_Secondmax {
	public static void main(String[] args) {
		
		int a[] = {10,20,5,6,89,45,6,89,6,80,9};
		
		int max = a[0];
		int smax= a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				smax = max;
				max = a[i];
			}
			else if (a[i]>smax && a[i]!=max)
			{
				smax = a[i];
			}
			
		}
		
		System.out.println("max : "+max);
		System.out.println("smax : "+smax);
		
		
		
	}
}
