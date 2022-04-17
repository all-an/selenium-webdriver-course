package pages;

import org.openqa.selenium.By;
import runner.RunBase;
import support.Utils;

public class LoginPage extends RunBase {

//    WebDriver webDriver;
    private final By create_email_input = By.id("email_create");
    private final By create_email_button = By.id("SubmitCreate");


//    public LoginPage(WebDriver webDriver) {
//        this.webDriver = webDriver;
//    }

    public void accessLoginScreen(){
        startDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        startDriver().manage().window().maximize();
        Utils.waitElementBePresent(create_email_input, 5);
    }

    public void fillEmailField(){
        startDriver().findElement(create_email_input).sendKeys(Utils.getRandomEmail());

    }

    public void clickCreateAccountButton(){//

        startDriver().findElement(create_email_button).click();
    }
}
