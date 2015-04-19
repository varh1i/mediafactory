package ee.varh1i.main.structural.filter;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria firstCriteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria firstCriteria, Criteria otherCriteria){
		this.firstCriteria = firstCriteria;
		this.otherCriteria = otherCriteria;
	}
	
	public List<Person> meetCriteria(List<Person> people) {
		List<Person> firstCriterisPeople = firstCriteria.meetCriteria(people);
		return otherCriteria.meetCriteria(firstCriterisPeople);
	}

}
