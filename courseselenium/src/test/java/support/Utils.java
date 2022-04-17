package support;

import courseselenium.RunCucumberTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public static void waitElementBePresent(By element, int time){

        WebDriverWait wait = new WebDriverWait(RunCucumberTest.driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public static String getRandomEmail(){

        String email_string = "allan_";
        String shortId = RandomStringUtils.random(6, "0123456789abcdefghijklmnopqrstuvxz.-_");
        String email_final = "@teste.com";

        return email_string + shortId + email_final;
    }

}
