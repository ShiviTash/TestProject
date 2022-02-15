package Com.Orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Orange.base.BaseClass;

public class LoginPage extends BaseClass {

	  @FindBy(xpath = "//input[@name='txtUsername']")
	  WebElement username;
	  
	  @FindBy(xpath = "//input[@name='txtPassword']")
	  WebElement password;
	  
	  @FindBy(xpath = "//input[@name='Submit']")
	  WebElement loginButton;
	  
	  @FindBy(xpath = "//img[1]")
	
	  WebElement Logo;
	  
	  public LoginPage()
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	  public boolean validatelogo() 
	  {	  
		  Logo.isDisplayed();
		  return true;
	  }
	  
	  public HomePage login() throws InterruptedException
	  {
		  username.sendKeys("Admin");
		  Thread.sleep(2000);
		  password.sendKeys("admin123");
		  loginButton.click();
		  
		  return new HomePage();
	  }
	
}
