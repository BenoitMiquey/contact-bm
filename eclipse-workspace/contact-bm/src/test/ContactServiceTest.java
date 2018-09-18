package test;

import org.junit.Assert;
import org.junit.Test;

public class ContactServiceTest {

	private ContactService service = new ContactService();

	@Test
	public void testNameTooShort() throws ContactException {
		try {
			service.add("aa");
			Assert.fail("Aurait du passer dans l'exception");
		} catch (ContactException e) {

			// Ok tout s'est bien passé
		}
	}

	@Test(expected = ContactException.class)
	public void testNameTooLong() throws ContactException {
		service.add("aaaaaaaaaaaaaaaaaa");
	}
	
	@Test(expected = ContactException.class)
	public void testNameNull() throws ContactException {
		service.add(null);
	}
	
	@Test(expected = ContactException.class)
	public void testNameExist() throws ContactException {
		service.add("aaa");
		service.add("aaa");
	}
	
	@Test
	public void testNameValide() throws ContactException {
		service.add("aaa");
	}
	
	@Test
	public void testRemoveName() throws ContactException{
		service.add("aaa");
		service.del("aaa");


	}
		
	
}
