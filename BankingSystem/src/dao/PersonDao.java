package dao;

import java.util.ArrayList;
import java.util.List;

import pojos.Person;

public class PersonDao {
	List<Person>persons;
	
	
	public PersonDao() {
		
		this.persons = new ArrayList<>();
	}

	public Person findPeron(String mailID,String password) {
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getMailid().equalsIgnoreCase(mailID)&&persons.get(i).getPassword().equalsIgnoreCase(password)) {
				return persons.get(i);
			}
		}
		return null;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
