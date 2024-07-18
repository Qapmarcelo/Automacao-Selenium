package Steps;

import Pages.HomePage;
import Pages.ProdutosPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static Runners.RunnerBase.getDriver;

public class ProdutosSteps {

      ProdutosPage produtosPage = new ProdutosPage();

    @And("escolho o tamanho {string}")
    public void escolhoOTamanho(String texto) {
        produtosPage.comboBoxTamanho(texto);

    }

    @And("escolho o cor {string}")
    public void escolhoOCor(String texto) {
        produtosPage.comboBoxCor(texto);
    }

    @And("clico no botao adicionar ao carrinho")
    public void clicoNoBotaoAdicionarAoCarrinho() {
        produtosPage.clicarBotaoCarrinho();
    }
}



