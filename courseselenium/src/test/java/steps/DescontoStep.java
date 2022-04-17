package steps;

import courseselenium.RunCucumberTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

public class DescontoStep{

    HomePage homePage = new HomePage();

    @Dado("que estou no site da qazando")
    public void que_estou_no_site_da_qazando() {

        homePage.accessHomePage();

    }

    @Quando("eu preencho meu email")
    public void eu_preencho_meu_email() {
        homePage.scrollDown();
        homePage.fillEmailInput();
    }

    @Quando("clico em ganhar cupom")
    public void clico_em_ganhar_cupom(){
        homePage.clickButtonDiscount();
    }

    @Entao("eu vejo o codigo de desconto")
    public void eu_vejo_o_codigo_de_desconto() {
        homePage.verifyDiscountCoupon();

        RunCucumberTest.driver.close();

    }

}