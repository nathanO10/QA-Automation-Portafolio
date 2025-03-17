package com.nttdata.ct.questions;

import com.nttdata.ct.userinterfaces.ProductsScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class LoginSuccess implements Question<Boolean> {

    public static Question<Boolean> ok(){
        return new LoginSuccess();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ProductsScreen.LBL_PRODUCTS).answeredBy(actor);
    }
}
