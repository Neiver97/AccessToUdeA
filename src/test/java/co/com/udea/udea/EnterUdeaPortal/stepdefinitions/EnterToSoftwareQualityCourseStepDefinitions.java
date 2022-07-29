package co.com.udea.udea.EnterUdeaPortal.stepdefinitions;

import co.com.udea.edu.EnterUdeaPortal.models.PersonalInformation;
import co.com.udea.edu.EnterUdeaPortal.questions.ValidateEnterLoggin;
import co.com.udea.edu.EnterUdeaPortal.questions.ValidateEnterMeeting;
import co.com.udea.edu.EnterUdeaPortal.tasks.AccessToHomePage;
import co.com.udea.edu.EnterUdeaPortal.tasks.EnterToMeeting;
import co.com.udea.edu.EnterUdeaPortal.tasks.EnterToPlatformLogin;
import static co.com.udea.edu.EnterUdeaPortal.utils.OwnWebDriver.nuevo;

import co.com.udea.edu.EnterUdeaPortal.tasks.SelectSoftwareQualityCourse;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class EnterToSoftwareQualityCourseStepDefinitions {


    @Given("^The student enter to login page$")
    public void theStudentEnterToLoginPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterToPlatformLogin.with());
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(nuevo().getWindowHandle()));
    }

    @When("^The student enter username and password and ckick to access$")
    public void theStudentEnterUsernameAndPasswordAndCkickToAccess(List<PersonalInformation> personalInformationsList) {
        OnStage.theActorInTheSpotlight().attemptsTo(AccessToHomePage.with(personalInformationsList));
    }

    @When("^The student select the course Software Quality$")
    public void theStudentSelectTheCourseSoftwareQuality() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectSoftwareQualityCourse.with());
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(nuevo().getWindowHandle()));
    }

    @When("^The student click to enter to meeting$")
    public void theStudentClickToEnterToMeeting() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterToMeeting.with());
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(nuevo().getWindowHandle()));
    }

    @Then("^The stundent will watch the alert and click to accept (.*)$")
    public void theStundentWillWatchTheAlertAndClickToAccept(Boolean flag) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEnterMeeting.answered(), Matchers.equalTo(flag)));
    }

    @Then("^The stundent will watch the message (.*)$")
    public void theStundentWillWatchTheMessage(String msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEnterLoggin.resp(),Matchers.equalTo(msj)));
    }

}
