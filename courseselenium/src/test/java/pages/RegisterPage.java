package pages;

import courseselenium.RunCucumberTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunBase;
import support.Utils;

public class RegisterPage extends RunBase {

//    WebstartDriver() startDriver();
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

//    public RegisterPage(WebstartDriver() startDriver()) {
//        this.startDriver() = startDriver();
//    }

    public void selectTitle(Integer type){
        Utils.waitElementBePresent(titleM, 6);
//        Utils.waitElementBePresent(titleF, 3);
        if(type == 1){
            startDriver().findElement(titleM).click();
        }else if(type == 2){
            startDriver().findElement(titleF).click();
        }
    }

    public void fillFirstName(String firstName){
        startDriver().findElement(first_name_field).sendKeys(firstName);
    }

    public void fillLastName(String lastName){
        startDriver().findElement(last_name_field).sendKeys(lastName);
    }

    public void fillPassword(String pass){
        startDriver().findElement(password_field).sendKeys(pass);
    }

    public void fillBirthDate(String day, String month, String year){
        Select selectDay = new Select(startDriver().findElement(byDay));
        selectDay.selectByValue(day);

        Select selectMonth = new Select(startDriver().findElement(byMonth));
        selectMonth.selectByValue(month);

        Select selectYear = new Select(startDriver().findElement(byYear));
        selectYear.selectByValue(year);
    }

    public void fillAddress(String address, String city, String state, String postCode, String phone){
        startDriver().findElement(byAddress1).sendKeys(address);
        startDriver().findElement(byCity).sendKeys(city);

        Select selectState = new Select(startDriver().findElement(byState));
        selectState.selectByValue(state);

        startDriver().findElement(byPostCode).sendKeys(postCode);

        fillMobilePhone(phone);

    }

    public void fillMobilePhone(String phone){
        startDriver().findElement(byPhoneMobile).sendKeys(phone);
    }

    public void clickRegister(){
        startDriver().findElement(bySubmitBtn).click();
    }

    public void registerValidation(String name, String lastName){
        Utils.waitElementBePresent(By.className("myaccount-link-list"), 5);
        String name_in_header = RunCucumberTest.startDriver()
                .findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assertions.assertEquals(name + " " + lastName, name_in_header, "Unsuccessful Registering");
    }
}
