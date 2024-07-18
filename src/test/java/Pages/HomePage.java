package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class HomePage extends RunCucumberTest {



    @FindBy(css = "#logo > a")
    private WebElement btnSimple;

    @FindBy(id = "product-2")
    private WebElement jacket2;

    @FindBy(css = "")
    private WebElement btnChekout;

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }
    public void clicarBtnSimple(){
        clicar(btnSimple);
    }

    public void clicarJacket2() {
        clicar(jacket2);
    }

    public void clicarBtnCheckout(){
        clicar(btnChekout);
    }
}