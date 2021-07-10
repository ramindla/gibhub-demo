package testclass;

import org.testng.annotations.Test;

public class LoginTest extends CommonClass {
	@Test(priority=1)
	public void loginwithcrd()
	{
	lp.loginToApp();
	}
	@Test(priority=2)
	public void logpin()
	{
		
		lp.logpin();
	
	}

}
