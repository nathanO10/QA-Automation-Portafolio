package com.nttdata.ct.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before(order=0)
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
