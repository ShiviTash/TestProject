/**
 * 
 */
package Com.Orange.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Orange.pages.LoginPage;

/**
 * @author Shivani Saini
 *
 */
public class BaseClass {
	
	public static WebDriver driver;
	public LoginPage loginpage;
     
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginpage=new LoginPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
