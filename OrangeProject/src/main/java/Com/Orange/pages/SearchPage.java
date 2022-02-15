package Com.Orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Orange.base.BaseClass;

public class SearchPage extends BaseClass  {

	@FindBy(xpath = "//input[@id='searchBtn']")
	WebElement searchTab;
	
	
	public SearchPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public SearchPage clickOnSearch() 
	{	
		searchTab.click();
		return new SearchPage();
	}
}