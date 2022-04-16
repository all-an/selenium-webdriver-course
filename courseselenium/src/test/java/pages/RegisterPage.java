package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class RegisterPage extends Utils {

    WebDriver driver;
    private final By titleM = By.id("id_gender1");
    private final By titleF = By.id("id_gender2");
    private final By first = By.id("id_gender2");
    private final By titleF = By.id("id_gender2");
    private final By titleF = By.id("id_gender2");
    private final By titleF = By.id("id_gender2");
    private final By titleF = By.id("id_gender2");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type){
        if(type == 1){
            driver.findElement(titleM).click();
        }else if(type == 2){
            driver.findElement(titleF).click();
        }
    }
}
