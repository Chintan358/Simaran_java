package array;

import java.util.Iterator;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		
//		int a[] = new int[5];
//		
//		a[0] = 10;
//		a[1] = 20;
//		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		System.out.println("***********************");
		
		int a[] = {10,20,30,40,50,60,50};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("***********************");
		
		
		String[] subject = {"java","php","Python"};
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
		}
		
		System.out.println("***********************");
		
		char ch[] = {'A','B','C'};
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
	}
}
