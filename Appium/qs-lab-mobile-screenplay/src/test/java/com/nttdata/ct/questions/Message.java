package com.nttdata.ct.questions;

import com.nttdata.ct.userinterfaces.LoginScreen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Message {

    public static Question<String> error(){
        return actor -> Text.of(LoginScreen.LBL_ERROR_MESSAGE).answeredBy(actor);
    }
}
