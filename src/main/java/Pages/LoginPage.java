package Pages;

import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //Page Factory - OR:
    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;


    //Initializing the Page Objects:
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public HomePage login(String un, String pwd) throws InterruptedException {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginButton.click();
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginButton);*/
        Thread.sleep(3000);

        return new HomePage();
    }


}
