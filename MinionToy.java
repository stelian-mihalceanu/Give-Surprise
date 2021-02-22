import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
	private String minionName;
	private static int minionCount = 0;
	private static ArrayList<String> minionNames =  new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	
	public MinionToy(String minionName) {
		this.minionName = minionName;
	}
	
	@Override
	public void enjoy() {
	    System.out.println("You open a MinionToy");
	    System.out.println("Your minion name is " + this.minionName);
	 }
	
	@Override
	public String toString() {
		return "Minionul oferit este: " + this.minionName + "";
	}
	
	public static MinionToy generate() {
		if (MinionToy.minionCount == MinionToy.minionNames.size()) {
			MinionToy.minionCount = 0;
		}
		return new MinionToy(minionNames.get(MinionToy.minionCount++));
	}

}
