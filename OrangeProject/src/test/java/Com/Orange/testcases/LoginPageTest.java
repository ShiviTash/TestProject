package Com.Orange.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Orange.base.BaseClass;
import Com.Orange.pages.HomePage;
import Com.Orange.pages.LoginPage;

public class LoginPageTest extends BaseClass
{
	//LoginPage loginpage;
	HomePage homepage;
	
	@Test(priority = 1)
	public void verifylogo()
	{
		//LoginPage loginpage=new LoginPage();
		boolean flag = loginpage.validatelogo();
		Assert.assertTrue(flag);
		System.out.println("verifylogo is passed");
	}
	
	@Test(priority = 2)
	public void loginTest() throws InterruptedException
	{
		homepage=loginpage.login();
		String expUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actUrl = driver.getCurrentUrl();
		Assert.assertEquals(actUrl, expUrl);
		System.out.println("loginTest is passed");
	}
}
