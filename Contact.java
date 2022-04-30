/* Contact.java class
 * Contact class represents Contact with ID, firstName,
lastName, phone, and address fields. */

public class Contact {

	private String ID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// set contact fields on object creation
	// throw exception if any field is improper
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		
		verifyID(id);
		this.ID = id;
		
		verifyFirstName(firstName);
		this.firstName = firstName;
		
		verifyLastName(lastName);
		this.lastName = lastName;
		
		verifyPhone(phone);
		this.phone = phone;
		
		verifyAddress(address);
		this.address = address;
	}
	
	private static void verifyID(String id) {
		if(id == null || id.length() < 10) {
			throw new IllegalArgumentException("ID must be > 10 chars, can't be null");
		}
		
	}
	
	private static void verifyFirstName(String firstName) {
		if(firstName == null || firstName.length() < 10) {
			throw new IllegalArgumentException("firstName must be > 10 chars, can't be null");
		}
	}
	
	
	private static void verifyLastName(String lastName) {
		if(lastName == null || lastName.length() < 10) {
			throw new IllegalArgumentException("lastName must be > 10 chars, can't be null");
		}
	}
	
	private static void verifyPhone(String phone) {
		if(phone == null || (phone.length() < 10 || phone.length() > 10)) {
			throw new IllegalArgumentException("phone must be 10 chars, can't be null");
		}
	}
	
	private static void verifyAddress(String address) {
		if(address == null || (address.length() > 30)) {
			throw new IllegalArgumentException("Address can't be > 30 chars, can't be null");
		}
	}
	
	 
	public String getID() {
		return ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	// should be updatable
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	// should be updatable
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	// should be updatable
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	// should be updatable
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Contact)) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Contact contact = (Contact) obj;
		return (contact.ID.equals(this.ID) && (contact.firstName.equals(this.firstName) &&
				contact.lastName.equals(this.lastName)) &&
				contact.phone.equals(this.phone) && contact.address.equals(this.address));
	}

}
