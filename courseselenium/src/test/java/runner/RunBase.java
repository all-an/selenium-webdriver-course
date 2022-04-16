package runner;

import org.openqa.selenium.WebDriver;

public class RunBase {

    public static WebDriver driver;

    private enum Browser{ //
        CHROME,
        FIREFOX
    }

    public static WebDriver getDriver(){
        return null;
    }

    public static WebDriver getDriver(Browser browser){
        return null;
    }
}
