package support;

import courseselenium.RunCucumberTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public void waitElementBePresent(By element, int time){

        WebDriverWait wait = new WebDriverWait(RunCucumberTest.driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

}
