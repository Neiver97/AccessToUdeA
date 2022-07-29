package co.com.udea.edu.EnterUdeaPortal.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ValidateEnterMeeting implements Question {

    private static boolean flag=false;

    @Override
    public Object answeredBy(Actor actor) {

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        if (ExpectedConditions.alertIsPresent()!=null){
            flag = true;
        }

        return flag;
    }

    public static ValidateEnterMeeting answered(){
        return new ValidateEnterMeeting();

    }

}
