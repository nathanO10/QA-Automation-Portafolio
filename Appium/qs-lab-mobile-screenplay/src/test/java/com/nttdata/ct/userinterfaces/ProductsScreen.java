package com.nttdata.ct.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsScreen {

    public static Target LBL_PRODUCTS = Target.the("Título productos")
            .locatedForAndroid(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"))
            .locatedForIOS(AppiumBy.xpath("X"));
}
