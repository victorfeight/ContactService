/*ContactService.java
Contact Service shall be able to add contacts with a unique ID,
delete contacts per contact ID, and update contact fields per contact ID 
* updatable fields:  firstName, lastName, Number, Address
* Contact list shall  be an ArrayList containing Contact objects
*/

import java.util.ArrayList;
public class ContactService {
	
	// store list of Contact objects
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	// return true on successful add, false on unsuccessful add
	// requirement: ID must be unique
	public boolean addContact(Contact newContact) {
		boolean present = false;

		
		for(Contact contact : contactList) {
			if(contact.equals(newContact)) {
				present = true;
			}
		}
		
		// if newContact not in list, add contact return true
		if(!present) {
			contactList.add(newContact);
			System.out.println("Added contact");
			return true;
		} else {
			// else return false
			System.out.println("Contact present");
			return false;
		}
	}

	// return true on successful delete, false on unsuccessful delete
	public boolean deleteContact(String id) {
		boolean state = false;
		for(Contact contact : contactList) {
			if (contact.getID().equals(id)) {
				state = contactList.remove(contact);
				if(state) {
					System.out.println("Contact deleted");
					return state;
				}
			}
		}
		System.out.println("Failed to delete contact: no id match");
		return false;
	}
	
	// return true on successful update, false on unsuccessful update
	// this implementation requires all parameters, allows blank names
	public boolean updateContact(String id, String firstName, String lastName, String phone, String address) {
		for(Contact contact : contactList) {
			if(contact.getID().equals(id)) {
				contact.setFirstName(firstName);
				contact.setLastName(lastName);
				contact.setPhone(phone);
				contact.setAddress(address);
				System.out.println("Contact updated");
				return true;
			}
		}
		System.out.println("No contact found");
		return false;
	}
}
