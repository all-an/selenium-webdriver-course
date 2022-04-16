package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver webDriver;
    private final By create_email_input = By.id("email_create");
    private final By create_email_button = By.id("SubmitCreate");


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void accessLoginScreen(){
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        webDriver.manage().window().maximize();
        waitElementBePresent(create_email_input, 5);
    }

    public void fillEmailField(){
        webDriver.findElement(create_email_input).sendKeys(getRandomEmail());

    }

    public void clickCreateAccountButton(){
        webDriver.findElement(create_email_button).click();
    }
}
