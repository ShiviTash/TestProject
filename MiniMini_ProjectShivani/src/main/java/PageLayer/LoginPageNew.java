package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class LoginPageNew extends Base {

	@FindBy(xpath="//input[@name='uid']")
	WebElement usernameBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwdBox;
	
	@FindBy(xpath="//input[@name='btnlogin']")
	WebElement submit_button;
	//Initializing the Page Objects:
	public LoginPageNew() throws IOException {
	PageFactory.initElements(driver, this);
    }
	//Action - validate Login and action on Elements
    public HomePage login22(String un, String pwd) throws IOException{
        /*
         * Performing actions on identified objects
         */
        usernameBox.sendKeys(un);
        
        pwdBox.sendKeys(pwd);
        //LocationChoose.click();
        submit_button.click();
		return new HomePage();

}}
