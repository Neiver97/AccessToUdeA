package co.com.udea.edu.EnterUdeaPortal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccessToLogin {
    public static Target INPUT_USERNAME = Target.the("INPUT to access to username")
            .locatedBy("//input[@id='username']");

    public static Target INPUT_PASSWORD = Target.the("INPUT to acces to password")
            .locatedBy("//input[@id='password']");

    public static Target BTN_ACCESS = Target.the("BTN to access to home page")
            .locatedBy("(//input[@class='buttons_login'])[1]");

    public static Target MSJ_ERROR = Target.the("MSJ access error")
            .locatedBy("//a[@id='loginerrormessage']");
}
