package ee.varh1i.main.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	public List<Person> meetCriteria(List<Person> people) {
		List<Person> females = new ArrayList<Person>();
		for(Person person: people){
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				females.add(person);
			}
		}
		return females;
	}
	
}
