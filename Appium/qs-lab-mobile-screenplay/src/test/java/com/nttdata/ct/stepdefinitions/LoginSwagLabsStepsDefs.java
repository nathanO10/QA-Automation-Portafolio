package com.nttdata.ct.stepdefinitions;

import com.nttdata.ct.questions.LoginSuccess;
import com.nttdata.ct.questions.Message;
import com.nttdata.ct.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginSwagLabsStepsDefs {

    @Given("que el usuario está en la aplicación de SwagLabs")
    public void que_el_usuario_está_en_la_aplicación_de_swag_labs() {
        theActorCalled("Usuario");
    }
    @When("el usuario ingresa sus credenciales usuario {string} y passsword {string}")
    public void el_usuario_ingresa_sus_credenciales_usuario_y_passsword(String user, String password) {
        theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(user, password)
        );

    }
    @Then("el inicio de sesión es satisfactorio")
    public void el_inicio_de_sesión_es_satisfactorio() {
        theActorInTheSpotlight().should(
                seeThat("El título products es visible", LoginSuccess.ok(), equalTo(true))
        );
    }

    @Then("se muestra el mensaje {string}")
    public void seMuestraElMensaje(String message) {
        theActorInTheSpotlight().should(
                seeThat("El mensaje de error", Message.error(), equalTo(message))
        );
    }
}
