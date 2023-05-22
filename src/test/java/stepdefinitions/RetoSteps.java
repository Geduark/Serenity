package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProcucto;
import userinterfaces.HomePage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.CarroCompras.LINK_ARTICULO_AGREGADO;

public class RetoSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Luis");
    private HomePage homepage = new HomePage();

    @Given("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homepage));
    }
    @When("^el agrega la cantidad (.*) del producto (.*) al carro$")
    public void elAgregaElAlCarro(String cantidad, String producto) {
        actor.wasAbleTo(
                BuscarProcucto.conDescripcion(producto),
                AgregarProducto.cantidad(cantidad)
        );
    }

    @Then("^el ve los productos listados en el carro de compras$")
    public void elVeLosProductosListadosEnElCarroDeCompras() {
        actor.should(seeThat(the(LINK_ARTICULO_AGREGADO),isPresent()));
    }


}
