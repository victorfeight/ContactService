import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class ContactTest {

	@Test
	public void testContactClass() {
		Contact contact = new Contact("0000000000001", "Johnny H Cartoon", "Bravo Xaviar Network III", "9101234545", "123 Jay Way");
		assertTrue(contact.getAddress().equals("123 Jay Way"));
		assertTrue(contact.getFirstName().equals("Johnny H Cartoon"));
		assertTrue(contact.getID().equals("0000000000001"));
		assertTrue(contact.getLastName().equals("Bravo Xaviar Network III"));
		assertTrue(contact.getPhone().equals("9101234545"));
	}
	
	@Test
	public void testExceptions() {
		
		// id too short
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("001", "Johnny H Cartoon", "Bravo Xaviar Network III", "9101234545", "123 Jay Way");
		});
		
		// first name too short
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny", "Bravo Xaviar Network III", "9101234545", "123 Jay Way");
		});
		
		// last name too short
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny H Cartoon", "Bravo", "9101234545", "123 Jay Way");
		});
		
		
		// number is 11
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny H Cartoon", "Bravo Xaviar Network III", "91012345450", "123 Jay Way");
		});
		
		
		// number is 9
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny H Cartoon", "Bravo Xaviar Network III", "910123454", "123 Jay Way");
		});
		
		// address is too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny H Cartoon", "Bravo Xaviar Network III", "9101234545", "123123123123123123123123123123123123123 Jay Way");
		});
		
		// id is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(null, "Johnny H Cartoon", "Bravo Xaviar Network III", "9101234545", "123 Jay Way");
		});
		
		// first null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", null, "Bravo Xaviar Network III", "9101234545", "123 Jay Way");
		});
		
		// last null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny H Cartoon", null, "9101234545", "123 Jay Way");
		});
		
		// number is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny H Cartoon", "Bravo Xaviar Network III", null, "123 Jay Way");
		});
		
		// address is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny H Cartoon", "Bravo Xaviar Network III", "9101234545", null);
		});
		
	}
		
		
	
}
