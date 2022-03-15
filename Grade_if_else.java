package taushif_java;

public class Grade_if_else {
public static void main(String[] args) {
	int marks= 55;
	if(marks>=95) {
		System.out.println("CGPA S");
	}else if(marks<95 && marks>=85) {
		System.out.println("Grade A");
	}else if(marks<85 && marks>=75) {
		System.out.println("Grade B");
	}else if(marks<75 && marks>=65) {
		System.out.println("Grade C");
	}else if(marks<65 && marks>=55) {
		System.out.println("Grade D");
	}else if(marks<55 && marks>=45) {
		System.out.println("Grade E");
	}else{
		System.out.println("Grade F");
	}
}
}
