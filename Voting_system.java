package taushif_java;

public class Voting_system {
	public static void main(String[] args) {
		int age=18;
		String nationality="india";
		if(nationality=="india") {
			if(age>=18) {
			System.out.println("eligible");
			}else {
				System.out.println("under age citizen");
			}
		}else {
			System.out.println("not an indian citizen");
			}		
	}
}
