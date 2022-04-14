package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class DescontosStep {

    @Dado("que estou no site da qazando")
    public void que_estou_no_site_da_qazando() {
        System.out.println("Passo 1");
    }
    @Quando("eu preencho meu email")
    public void eu_preencho_meu_email() {
        System.out.println("Passo 2");
    }
    @Quando("clico em ganhar cupom")
    public void clico_em_ganhar_cupom() {
        System.out.println("Passo 3");
    }
    @Entao("eu vejo o codigo de desconto")
    public void eu_vejo_o_codigo_de_desconto() {
        System.out.println("Passo 4");
    }

}
