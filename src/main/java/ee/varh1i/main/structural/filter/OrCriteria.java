package ee.varh1i.main.structural.filter;

import java.util.List;

public class OrCriteria implements Criteria {

	private Criteria firstCriteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria firstCriteria, Criteria otherCriteria){
		this.firstCriteria = firstCriteria;
		this.otherCriteria = otherCriteria;
	}
	
	public List<Person> meetCriteria(List<Person> people) {
		List<Person> firstCriteriaPeople = firstCriteria.meetCriteria(people);
		List<Person> otherCriteriaPeople = otherCriteria.meetCriteria(people);
		for(Person person : otherCriteriaPeople){
			if(!firstCriteriaPeople.contains(person)){
				firstCriteriaPeople.add(person);
			}
		}
		return firstCriteriaPeople;
	}

}
