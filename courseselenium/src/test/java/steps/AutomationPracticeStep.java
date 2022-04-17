package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.RunBase;

import java.util.concurrent.TimeUnit;

public class AutomationPracticeStep extends RunBase {



    @Dado("que estou no site da automationpractice")
    public void que_estou_no_site_da_automationpractice() {

        startDriver().get("http://automationpractice.com/index.php");
        startDriver().manage().window().maximize();
        startDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Quando("eu preencho shirt em search")
    public void eu_preencho_shirt_em_search() {
        startDriver().findElement(By.id("search_query_top")).sendKeys("shirt");
    }
    @Quando("clico em search")
    public void clico_em_search() {

        WebElement ele = startDriver().findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
        ele.click();

    }
    @Entao("eu vejo Faded Short Sleeve T-shirts")
    public void eu_vejo_faded_short_sleeve_t_shirts() {

        String text_shirt = startDriver().findElement(By
                .cssSelector("#center_column > ul > li > div > div.right-block > h5 > a")).getText();

        System.out.println(text_shirt);

        startDriver().close();

    }

}
