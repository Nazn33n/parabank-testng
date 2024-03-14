package Pages;

import Base.TestBase;
import Model.RegisterParam;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends TestBase {
    @FindBy(id = "customer.firstName")
    WebElement firstName;
    @FindBy(id = "customer.lastName")
    WebElement lastName;
    @FindBy(id = "customer.address.street")
    WebElement address;

    @FindBy(id = "customer.address.city")
    WebElement city;
    @FindBy(id = "customer.address.state")
    WebElement state;
    @FindBy(id = "customer.address.zipCode")
    WebElement zipCode;
    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    WebElement ssn;
    @FindBy(id = "customer.username")
    WebElement username;
    @FindBy(id = "customer.password")
    WebElement password;
    @FindBy(id = "repeatedPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")
    WebElement registerButton;

    public RegisterPage() {
        PageFactory.initElements(driver, this);

    }

    public void register(RegisterParam registerParam) throws InterruptedException {
        firstName.sendKeys(registerParam.getFirstName());
        lastName.sendKeys(registerParam.getLastName());
        address.sendKeys(registerParam.getAddress());
        city.sendKeys(registerParam.getCity());
        state.sendKeys(registerParam.getState());
        zipCode.sendKeys(registerParam.getZipCode());
        phoneNumber.sendKeys(registerParam.getPhoneNumber());
        ssn.sendKeys(registerParam.getSsn());
        username.sendKeys(registerParam.getUsername());
        password.sendKeys(registerParam.getPassword());
        confirmPassword.sendKeys(registerParam.getConfirmPassword());
        Thread.sleep(3000);

        registerButton.click();
        Thread.sleep(3000);
    }

    /* JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", registerButton);*/
    public String validateRegisterPageTitle() {
        return driver.getTitle();
    }

}
