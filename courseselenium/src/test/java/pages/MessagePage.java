package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class MessagePage extends Utils {

    WebDriver driver;

    private final By subject_field_select = By.id("id_contact");
    private final By email_field = By.id("email");
    private final By message_field = By.id("message");
    private final By upload_field = By.id("fileUpload");
    private final By btn_submit_message = By.id("submitMessage");

    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessMesssagePage(){
        driver.get("http://automationpractice.com/index.php?controller=contact");
        waitElementBePresent(message_field, 4);
    }

    public void selectSubject(String subject){
        Select selectSubject = new Select(driver.findElement(subject_field_select));
        selectSubject.selectByValue(subject);
    }

    public void fillEmailField(String email){
        driver.findElement(email_field).sendKeys(email);
    }

    public void fillMessage(String message){
        driver.findElement(message_field).sendKeys(message);
    }

    public void uploadFile(String pathToFile){
        driver.findElement(upload_field).sendKeys(pathToFile);
    }

    public void clickButtonSubmit(){
        driver.findElement(btn_submit_message).click();
    }

    public void submitValidation(){//
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".footer_links > li:nth-child(1) > a:nth-child(1)")));
        String success_msg = driver.findElement(By.cssSelector(".alert")).getText();//
        Assertions.assertEquals("Your message has been successfully sent to our team.", success_msg,"Unsuccessful Registering");
    }

}
