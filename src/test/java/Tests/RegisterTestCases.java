package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.RegisterPage;
import Model.RegisterParam;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTestCases extends TestBase {

    RegisterPage registerPage;
    HomePage homePage;

    public RegisterTestCases() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization("registerUrl");
        registerPage = new RegisterPage();

    }


    @Test(priority=1)
    public void registerTest() throws InterruptedException {
        RegisterParam registerParam = RegisterParam.builder()
                .firstName(prop.getProperty("firstName"))
                .lastName(prop.getProperty("lastName"))
                .address(prop.getProperty("address"))
                .city(prop.getProperty("city"))
                .zipCode(prop.getProperty("zipCode"))
                .state(prop.getProperty("state"))
                .phoneNumber(prop.getProperty("phoneNumber"))
                .ssn(prop.getProperty("ssn"))
                .username(prop.getProperty("username"))
                .password(prop.getProperty("password"))
                .confirmPassword(prop.getProperty("confirm_pass"))
                .build();

        registerPage.register(registerParam);
    }
    @Test(priority=2)
    public void registerPageTitleTest()  {
        String title = registerPage.validateRegisterPageTitle();
        Assert.assertEquals(title, "Your account was created successfully. You are now logged in.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
