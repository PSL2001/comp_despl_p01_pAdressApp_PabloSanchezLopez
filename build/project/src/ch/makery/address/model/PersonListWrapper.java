/**
 * comp_despl_p01_pAdressApp_PabloSanchezLopez - ch.makery.address.model - PersonListWrapper.java
 * 1 feb 2023 - 9:11:10
 * @author Pablo Sánchez López
 */
package ch.makery.address.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 * 
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
public class PersonListWrapper {

	private List<Person> persons;

	@XmlElement(name = "person")
	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}