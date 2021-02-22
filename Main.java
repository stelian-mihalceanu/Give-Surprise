
public class Main {

	public static void main(String[] args) {
		BagFactoryOptimizeStorage test = new BagFactoryOptimizeStorage();
		IBag randomBag = test.makeBag("RANDOM");
		
		for (int i = 0 ; i < 5; i++) {
			randomBag.put(GatherSurprises.gather());
		}
		
		GiveSurpriseAndHug surpriza1 = new GiveSurpriseAndHug("FIFO", 1);
		
		GiveSurpriseAndApplause surpriza2 = new GiveSurpriseAndApplause("LIFO", 3);
		
		GiveSurpriseAndSing surpriza3 = new GiveSurpriseAndSing("RANDOM", 5);

		surpriza1.put(GatherSurprises.gather(7));
		System.out.println(surpriza1);
		surpriza1.giveAll();
		
		for (int i = 0; i < 5; i++) {
			surpriza1.put(GatherSurprises.gather());
		}
		
		System.out.println(surpriza1);
		for (int i = 0; i < 5; i++) {
			surpriza1.give();
		}
				
		surpriza2.put(GatherSurprises.gather(15));
		System.out.println(surpriza2);
		surpriza2.giveAll();
		
		surpriza3.put(GatherSurprises.gather(5));
		System.out.println(surpriza3);
		surpriza3.giveAll();		

	}

}
