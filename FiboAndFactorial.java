package taushif_java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiboAndFactorial {
	public static void fibo(int a) {
		List<Integer> fib = new ArrayList<>();
		fib.add(0);
		fib.add(1);
		for (int i = 0; i < a - 2; i++) {
			int sum = fib.get(i) + fib.get(i + 1);
			fib.add(sum);
		}
		System.out.println(fib);

	}
//	n* n-1 n-2

	public static void factorial(int a) {
		int fact=1;
		for (int i = 1; i <= a; i++) {
			fact=fact*i;
		}
		System.out.println("factorial:- "+fact);
	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("fibbonachi series till:- ");
		int a = num.nextInt();
		fibo(a);
		factorial(a);

	}
}
