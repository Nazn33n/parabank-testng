package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTestCases extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTestCases(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization("loginUrl");
        loginPage = new LoginPage();

    }


    @Test
    public void loginTest() throws InterruptedException {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
