package ee.varh1i.main.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	public List<Person> meetCriteria(List<Person> people) {
		List<Person> males = new ArrayList<Person>();
		for(Person person: people){
			if(person.getGender().equalsIgnoreCase("MALE")){
				males.add(person);
			}
		}
		return males;
	}

}
