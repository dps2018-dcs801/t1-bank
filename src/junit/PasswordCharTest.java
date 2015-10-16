package junit;

import junit.framework.Assert;
import org.junit.Test;
import banksystem.PasswordManager;


public class PasswordCharTest {
	
	
	@Test
	public void checkAtLeastOneNonANumeric() {
		String password = "ab";
		Assert.assertEquals("Password must contain at least 1 non-alphanumeric character", PasswordManager.validate(password));
	}
	
	
	@Test
	public void checkAtLeastOneANumeric() {
		String password = "**";
		Assert.assertEquals("Password must contain at least 1 alphanumeric character", PasswordManager.validate(password));
	}
}
