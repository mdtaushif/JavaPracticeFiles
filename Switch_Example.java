package taushif_java;

public class Switch_Example {

	public static void main(String[] args) {
		String halal_gen="gold";
		String answer;
		switch(halal_gen) {
		case "silver":
			answer="halal";
			break;
		case "gold":
			answer="haram";
			break;
		default:
			answer="greay area";
			break;
		}
		System.out.println(answer);

	}

}
