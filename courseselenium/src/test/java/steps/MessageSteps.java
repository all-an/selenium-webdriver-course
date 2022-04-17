package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.MessagePage;
import runner.RunBase;

public class MessageSteps extends RunBase {

    MessagePage messagePage = new MessagePage(driver);

    @Dado("que estou na tela de mensagens")
    public void que_estou_na_tela_de_mensagens() {
        messagePage.accessMesssagePage();

    }
    @Dado("preencho todos os campos")
    public void preencho_todos_os_campos() {
        messagePage.selectSubject("1");
        messagePage.fillEmailField("teste@allan.com");
        messagePage.fillMessage("Testando enviar arquivo");
        messagePage.uploadFile("C:\\Users\\Public\\selenium-webdriver-course\\courseselenium\\arquivo.png");
    }
    @Quando("clico em enviar mensagem")
    public void clico_em_enviar_mensagem() {
        messagePage.clickButtonSubmit();
    }
    @Entao("sou notificado de mensagem enviada com sucesso")
    public void sou_notificado_de_mensagem_enviada_com_sucesso() {
        messagePage.submitValidation();
    }

}
