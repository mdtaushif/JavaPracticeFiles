package taushif_java;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int a ,b,c;
		Scanner number= new Scanner(System.in);
		System.out.print("enter the first number");
		a=number.nextInt();
		System.out.print("enter the second number");
		b=number.nextInt();
		c=a*b;
		System.out.print("the answer is ");
		System.out.println(c);
		
	}
}
