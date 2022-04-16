package pages;

import courseselenium.RunCucumberTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class RegisterPage extends Utils {

    WebDriver driver;
    private final By titleM = By.id("id_gender1");
    private final By titleF = By.id("id_gender2");
    private final By first_name_field = By.id("customer_firstname");
    private final By last_name_field = By.id("customer_lastname");
    private final By password_field = By.id("passwd");

    private final By byDay = By.id("days");
    private final By byMonth = By.id("months");
    private final By byYear = By.id("years");

    private final By byAddress1 = By.id("address1");
    private final By byCity = By.id("city");
    private final By byState = By.id("id_state");
    private final By byPostCode = By.id("postcode");

    private final By byPhoneMobile = By.id("phone_mobile");

    private final By bySubmitBtn = By.id("submitAccount");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type){
        waitElementBePresent(titleM, 4);
        waitElementBePresent(titleF, 3);
        if(type == 1){
            driver.findElement(titleM).click();
        }else if(type == 2){
            driver.findElement(titleF).click();
        }
    }

    public void fillFirstName(String firstName){
        driver.findElement(first_name_field).sendKeys(firstName);
    }

    public void fillLastName(String lastName){
        driver.findElement(last_name_field).sendKeys(lastName);
    }

    public void fillPassword(String pass){
        driver.findElement(password_field).sendKeys(pass);
    }

    public void fillBirthDate(String day, String month, String year){
        Select selectDay = new Select(driver.findElement(byDay));
        selectDay.selectByValue(day);

        Select selectMonth = new Select(driver.findElement(byMonth));
        selectMonth.selectByValue(month);

        Select selectYear = new Select(driver.findElement(byYear));
        selectYear.selectByValue(year);
    }

    public void fillAddress(String address, String city, String state, String postCode, String phone){
        driver.findElement(byAddress1).sendKeys(address);
        driver.findElement(byCity).sendKeys(city);

        Select selectState = new Select(driver.findElement(byState));
        selectState.selectByValue(state);

        driver.findElement(byPostCode).sendKeys(postCode);

        fillMobilePhone(phone);

    }

    public void fillMobilePhone(String phone){
        driver.findElement(byPhoneMobile).sendKeys(phone);
    }

    public void clickRegister(){
        driver.findElement(bySubmitBtn).click();
    }

    public void registerValidation(String name, String lastName){
        waitElementBePresent(By.className("myaccount-link-list"), 5);
        String name_in_header = RunCucumberTest.driver
                .findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assertions.assertEquals(name + " " + lastName, name_in_header, "Unsuccessful Registering");
    }
}
