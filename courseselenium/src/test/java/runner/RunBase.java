package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBase {

    public static WebDriver driver;

    private enum Browser{ //
        CHROME,
        FIREFOX
    }

    public static WebDriver startDriver(){
        if(driver == null){
            return startDriver(Browser.CHROME);
        }else{
            return driver;
        }
    }

    public static WebDriver startDriver(Browser browser){
        if(driver != null){
            driver.quit();
        }

        switch (browser){
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Wrong browser passed as argument.");
        }
        return driver;
    }
}
