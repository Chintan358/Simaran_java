package basic;

public class Sample {
	public static void main(String[] args) {
			
//		byte b = -128;
//		short s = 32767;
//		int i = 565;
//		long l = 456454545;
//		float f = 125.5656565656f;
//		double d = 4545.5656565565656565656;
//		char c = 'a';
//		boolean bool = true;
//		
//		int k = 'H';
//		System.out.println(k);
//		
//		char ch = 38;
//		System.out.println(ch);
		
		//widning  //implicite
		int k = 100;  //4 byte
		long l = k;   //8 byte
		
		//nerrowing //explicite
		long a = 5656565955555l;
		int b = (int) a;
		System.out.println(b);
		
		
		
		
		
		
		
	}
}
