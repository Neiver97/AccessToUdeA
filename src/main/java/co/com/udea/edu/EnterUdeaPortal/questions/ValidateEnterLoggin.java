package co.com.udea.edu.EnterUdeaPortal.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.udea.edu.EnterUdeaPortal.userinterfaces.AccessToLogin.*;

public class ValidateEnterLoggin implements Question {

    private String msj;

    @Override
    public Object answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(MSJ_ERROR, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        msj = MSJ_ERROR.resolveFor(actor).getText();

        return msj;
    }

    public static ValidateEnterLoggin resp(){
        return new ValidateEnterLoggin();
    }
}
