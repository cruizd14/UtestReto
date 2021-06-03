package co.com.bancolombia.certification.utestreto.stepdefinitions;

import co.com.bancolombia.certification.utestreto.task.RegisterUserReto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("yeison");
    }

    @Given("^usuario en la pagina principal$")
    public void usuarioEnLaPaginaPrincipal() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));


    }


    @When("^El usuario crea una cuenta llenando todos los campos$")
    public void elUsuarioCreaUnaCuentaLlenandoTodosLosCampos() {
        theActorInTheSpotlight().attemptsTo(RegisterUserReto.makeinformation());

    }

    @Then("^El usuario ve su nombre de usuario$")
    public void elUsuarioVeSuNombreDeUsuario() {

    }
}
