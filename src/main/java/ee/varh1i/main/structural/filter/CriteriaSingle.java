package ee.varh1i.main.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	public List<Person> meetCriteria(List<Person> people) {
		List<Person> singles = new ArrayList<Person>();
		for(Person person: people){
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				singles.add(person);
			}
		}
		return singles;
	}

}
