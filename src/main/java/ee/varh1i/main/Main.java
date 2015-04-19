package ee.varh1i.main;

import java.util.ArrayList;
import java.util.List;

import ee.varh1i.main.structural.filter.AndCriteria;
import ee.varh1i.main.structural.filter.Criteria;
import ee.varh1i.main.structural.filter.CriteriaFemale;
import ee.varh1i.main.structural.filter.CriteriaMale;
import ee.varh1i.main.structural.filter.CriteriaSingle;
import ee.varh1i.main.structural.filter.OrCriteria;
import ee.varh1i.main.structural.filter.Person;


public class Main {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
	    people.add(new Person("Robert","Male", "Single"));
	    people.add(new Person("John", "Male", "Married"));
	    people.add(new Person("Laura", "Female", "Married"));
	    people.add(new Person("Diana", "Female", "Single"));
	    people.add(new Person("Mike", "Male", "Single"));
	    people.add(new Person("Bobby", "Male", "Single"));

	    Criteria female = new CriteriaFemale();
	    Criteria male = new CriteriaMale();
	    Criteria single = new CriteriaSingle();
	    Criteria singleMale = new AndCriteria(male, single);
	    Criteria singleOrFemale = new OrCriteria(single, female);
	    
	    System.out.println("Males: ");
	    printPeople(male.meetCriteria(people));
	    
	    System.out.println("\nFemales: ");
	    printPeople(female.meetCriteria(people));
	    
	    System.out.println("\nSingle males: ");
	    printPeople(singleMale.meetCriteria(people));
	    
	    System.out.println("\nSingle or females: ");
	    printPeople(singleOrFemale.meetCriteria(people));
	    
	}

	public static void printPeople(List<Person> people){
		for(Person person : people)
		System.out.println(person.getName() + " is a " + person.getMaritalStatus() + " " + person.getGender());
	}
	
}
