package main;

import java.util.ArrayList;
import java.util.List;

public class ContactDao implements IContactDao {
	
	List<Contact> contacts = new ArrayList<>();

	@Override
	public List<Contact> readAll(){
		return contacts;
	}
	
	@Override
	public Contact findByName(String name){
		Contact contactToReturn = null;
		// Select * from contacts where name = %1 
		// prepared statement . add (%1 , name) 
		// exectuteQuery 
		for (Contact contact : contacts) {
			if(contact.getName().equalsIgnoreCase(name)){
				contactToReturn = contact;
				break;
			}
		}
		return contactToReturn;
	}
	
	@Override
	public void add(Contact contact){
		contacts.add(contact);
		
	}

	@Override
	public void remove(String name) {
		contacts.remove(name);
		
	}
}
