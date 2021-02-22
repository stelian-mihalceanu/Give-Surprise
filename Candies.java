import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Candies implements ISurprise {
	private int numberOfCandies;
	private String candiesType;
	private static ArrayList<String> candieType = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
	private static Random randomNr = new Random();
	
	public Candies(int numberOfCandies, String candiesType) {
		this.numberOfCandies = numberOfCandies;
		this.candiesType = candiesType;
	}
	
	@Override
	public void enjoy() {
	    System.out.println("You open a Candie surprise");
	    System.out.println("You get " + this.numberOfCandies + " " + this.candiesType + " candies");
	 }
	
	@Override
	public String toString() {
		return "A primit " + this.numberOfCandies + " bomboane de tipul: " + this.candiesType;
	}
	
	public static Candies generate() {
		return new Candies(Candies.randomNr.nextInt(100), Candies.candieType.get(Candies.randomNr.nextInt(Candies.candieType.size())));
	}


}
