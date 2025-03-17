package com.nttdata.ct.tasks;

import com.nttdata.ct.userinterfaces.LoginScreen;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password){
        return instrumented(Login.class, username, password);
    }

    @Step("{0} realiza el login en la aplicación")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginScreen.TXT_USER),
                Enter.theValue(password).into(LoginScreen.TXT_PASSWORD),
                Click.on(LoginScreen.BTN_LOGIN)
        );
    }
}
