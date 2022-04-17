package steps;

import io.cucumber.java.pt.Dado;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        loginPage.accessLoginScreen();
    }

    @Dado("acesso o cadastro de usuario")
    public void acesso_o_cadastro_de_usuario() {
        loginPage.fillEmailField();
        loginPage.clickCreateAccountButton();
    }
}
