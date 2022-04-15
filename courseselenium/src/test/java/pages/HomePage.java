package pages;


import courseselenium.RunCucumberTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessHomePage(){
        driver.get("https://qazando.com.br/curso.html");
        driver.manage().window().maximize();
        waitElementBePresent(By.id("btn-ver-cursos"),10);
        Assertions.assertTrue(driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Falhou ao esperar thread para rolar página");
        }
    }

    public void fillEmailInput(){
        driver.findElement(By.id("email")).sendKeys("allan8tech@gmail.com");
    }

    public void clickButtonDiscount(){
        driver.findElement(By.id("button")).click();
    }

    public void verifyDiscountCoupon(){
        String text_cupom = RunCucumberTest.driver.findElement(By
                .cssSelector("#cupom > h2 > span")).getText();
        System.out.println(text_cupom);

        Assertions.assertEquals("QAZANDO15OFF" , text_cupom, "O cupom está errado");
    }

}
