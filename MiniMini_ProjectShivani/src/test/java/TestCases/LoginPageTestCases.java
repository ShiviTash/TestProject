package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base;
import PageLayer.LoginPageNew;

public class LoginPageTestCases extends Base{

	public LoginPageNew lp;
    //HomePage homePage;
    //Step 1
    public  LoginPageTestCases() throws IOException {
        super();

    }
    //Step2

    @BeforeMethod
    public void SSSetUp() throws IOException {
        /*
         * Setting up browser and website to execute test scripts
         */
        initialization();
        /*
         * To access all login elements and actions we made an object of LoginPageNew
         * class
         */
        lp=new LoginPageNew();   
    }
    @Test
    public void validateLoginnnn() throws IOException
    {
        //lp.login22(prop.getProperty("username"), prop.getProperty("password"));
         lp.login22("mngr385727", "babymAz");
    }
}
