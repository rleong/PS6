package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person_Test {

	private static LocalDate testDate;
	private static PersonDomainModel person;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		StringProperty fn = new SimpleStringProperty("Russell");
		StringProperty ln = new SimpleStringProperty("Leong");
		StringProperty d = new SimpleStringProperty("Woodline");
		StringProperty c = new SimpleStringProperty("Middletown");
		IntegerProperty p = new SimpleIntegerProperty(19709);
		ObjectProperty<LocalDate> testDate = new SimpleObjectProperty<LocalDate>(LocalDate.now());
		person = new PersonDomainModel(fn, ln, d, p, c, testDate);
		PersonDAL.addPerson(person);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_addPerson() {
	//	assertEquals(person, PersonDAL.getPerson(person.getPersonID()));
	}
	
	@Test
	public void test_deletePerson() {
	//	PersonDAL.deletePerson(person.getPersonID());
	//	assertEquals(null, PersonDAL.getPerson(person.getPersonID()));
	}
	
	@Test
	public void test_updatePerson() {
	//	person.setCity("Newark");
	//	PersonDAL.updatePerson(person);
	//	assertEquals(person, StudentDAL.getStudent(person.getPersonID()));
	}
	
}
