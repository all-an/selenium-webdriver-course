package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.RegisterPage;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    String name = "Allan";
    String lastName = "Abrahao";

    @Quando("eu preencho o formulario de cadastro")
    public void eu_preencho_o_formulario_de_cadastro() {
        registerPage.selectTitle(1);
        registerPage.fillFirstName(name);
        registerPage.fillLastName(lastName);
        registerPage.fillPassword("asdfaasdf");
        registerPage.fillBirthDate("1", "2", "2010");
        registerPage.fillAddress("98875 Iliee St Aiea, Hawaii","Aiea","11",
                "96701","808-483-7333");
    }

    @Quando("clico em registrar")
    public void clico_em_registrar() {
        registerPage.clickRegister();
    }

    @Entao("vejo a mensagem de cadastro com sucesso")
    public void vejo_a_mensagem_de_cadastro_com_sucesso() {//

        registerPage.registerValidation(name , lastName);
    }

}
