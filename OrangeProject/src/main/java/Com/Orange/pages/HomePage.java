package Com.Orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Orange.base.BaseClass;

public class HomePage extends BaseClass 
{

	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']/b")
	WebElement adminTab;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public SystemUsersPage clickOnAdmin() 
	{	
		adminTab.click();
		return new SystemUsersPage();
	}
}
