package Com.Orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Orange.base.BaseClass;

public class SystemUsersPage extends BaseClass {
	  @FindBy(xpath ="//*[@id=\"searchSystemUser_userName\"]")
	  WebElement username;
	  
	  @FindBy(xpath = "//*[@id=\"searchSystemUser_userType\"]")
	  WebElement userRole;
	  
	  @FindBy(xpath = "//*[@id=\"searchSystemUser_employeeName_empName\"]")
	  WebElement  empname;
	  
	  @FindBy(xpath = "//*[@id=\"searchSystemUser_status\"]")	
	  WebElement status;
	  
	  @FindBy(xpath = "//*[@id=\"searchBtn\"]")
	  WebElement searchButton;
	  
	  
	  public SystemUsersPage()
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	 // 
	  
	  public SystemUsersPage Searchuser() throws InterruptedException
	  {
		  username.sendKeys("Admin");
		  Thread.sleep(2000);
		  userRole.sendKeys("All");
		  empname.sendKeys("Joe Root");
		  status.sendKeys("All");
		  searchButton.click();
		  
		  return new SystemUsersPage();
	  }
	
}
