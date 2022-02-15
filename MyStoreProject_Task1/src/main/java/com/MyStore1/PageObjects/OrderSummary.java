package com.MyStore1.PageObjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyProject1.Base.Base;
import com.MyStore1.actiondriver.Action;



/**
 * @author Shivani
 *
 */
public class OrderSummary extends Base
{
	
	Action action= new Action();
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	private WebElement confirmOrderBtn;
	
	public OrderSummary() {
		PageFactory.initElements(getDriver(), this);
	}

	public OrderConfirmationPage clickOnconfirmOrderBtn() throws Throwable {
		action.click(getDriver(), confirmOrderBtn);
		return new OrderConfirmationPage();
	}
	
}