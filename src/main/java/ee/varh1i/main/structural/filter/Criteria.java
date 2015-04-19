package ee.varh1i.main.structural.filter;

import java.util.List;

public interface Criteria {

	List<Person> meetCriteria(List<Person> people);
}
