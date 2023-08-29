package org.cts;

public class CTSInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringSwap();
		evenNumbers(1);

	}
	public static void evenNumbers(int i) {
		if(i<=30) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
			evenNumbers(i);
		}
	}
	public static void swapingTwoNumbersWithout() {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void stringSwap() {
		String s1="Keerthi";
		String s2="Vasan";
		System.out.println("Before swap"+s1);
		System.out.println("Before swap"+s2);
		s1= s1+" "+s2;
		s2=s1.split(" ")[0];
		s1=s1.split(" ")[1];
		System.out.println("After swap"+s1);
		System.out.println("After swap"+s2);
	}
public static void increment() {
	int x=20;

	System.out.println(++x);
	System.out.println(x++);
	System.out.println(--x);
	System.out.println(x--);
	System.out.println(x);	
}
}
