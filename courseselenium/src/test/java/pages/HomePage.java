package pages;


import courseselenium.RunCucumberTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.RunBase;
import support.Utils;

public class HomePage extends RunBase {

    public void accessHomePage(){
        startDriver().get("https://qazando.com.br/curso.html");
        startDriver().manage().window().maximize();
        Utils.waitElementBePresent(By.id("btn-ver-cursos"),10);
        Assertions.assertTrue(startDriver().findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown(){
        JavascriptExecutor jse = (JavascriptExecutor) startDriver();
        jse.executeScript("window.scrollTo(0, 10000)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Falhou ao esperar thread para rolar página");
        }
    }

    public void fillEmailInput(){
        startDriver().findElement(By.id("email")).sendKeys("allan8tech@gmail.com");
    }

    public void clickButtonDiscount(){
        startDriver().findElement(By.id("button")).click();
    }

    public void verifyDiscountCoupon(){
        String text_cupom = RunCucumberTest.startDriver().findElement(By
                .cssSelector("#cupom > h2 > span")).getText();
        System.out.println(text_cupom);

        Assertions.assertEquals("QAZANDO15OFF" , text_cupom, "O cupom está errado");
    }

}
