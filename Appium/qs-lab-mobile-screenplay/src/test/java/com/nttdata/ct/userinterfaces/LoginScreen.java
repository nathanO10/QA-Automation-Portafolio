package com.nttdata.ct.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginScreen {

    public static final Target TXT_USER = Target.the("Campo usuario")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"))
            .locatedForIOS(AppiumBy.xpath("X"));

    public static final Target TXT_PASSWORD = Target.the("Campo contraseña")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"))
            .locatedForIOS(AppiumBy.xpath("X"));

    public static final Target BTN_LOGIN = Target.the("Botón login")
            .locatedForAndroid(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"))
            .locatedForIOS(AppiumBy.xpath("X"));

    public static final Target LBL_ERROR_MESSAGE = Target.the("Mensaje de error")
            .locatedForAndroid(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView"))
            .locatedForIOS(AppiumBy.xpath("X"));
}
