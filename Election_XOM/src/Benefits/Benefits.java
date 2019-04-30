package Benefits;
import java.util.ArrayList;
import java.util.List;

public class Benefits {

	public List<Parents> parents;
	public String name;
	public String maritalStatus;
	public int noOfChildren;
	List<String> benefitList = new ArrayList<String>();

	// public List<String> dataList = new ArrayList<String>();
	// public List<String>finalData;

	public List<String> benefitsData() {
		// benefitList.add("Hi");
		// List<String> benefitList = new ArrayList<String>();
		for (Parents p : parents) {
			if (p.relation.equalsIgnoreCase("father") && p.age >= 45) {
				benefitList.add("father is eligible for pension");
			} else if (p.relation.equalsIgnoreCase("mother") && p.age >= 35) {
				benefitList.add("mother is eligible for pension");
			} else if (p.relation.equalsIgnoreCase("wife") && p.age >= 25) {
				benefitList.add("wife is eligible for dwacra");
			} else {
				benefitList.add("not eligible ");
			}
		}
		return benefitList;

	}

}
