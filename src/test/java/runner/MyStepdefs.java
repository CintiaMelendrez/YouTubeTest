package runner;

import activity.MainActivity;
import activity.YouTubeManagerActivity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepdefs {

    MainActivity mainActivity = new MainActivity();
    YouTubeManagerActivity youTubeManagerActivity = new YouTubeManagerActivity();

    @Given("^I have open my YouTube app$")
    public void iHaveOpenMyYouTubeApp() {

    }

    @When("^I click \\[search\\] button in main activity$")
    public void iClickSearchButtonInMainActivity() throws MalformedURLException {
        mainActivity.searchButton.click();
    }

    @And("^I type '(.*)' in \\[video name\\] textbox in YouTube manager Activity$")
    public void iTypeMileyCyrusMalibuInVideoNameTextboxInYouTubeManagerActivity(String value) throws MalformedURLException {
        youTubeManagerActivity.searchVideo.type(value);
    }

    @Then("^the search '(.*)' is displayed$")
    public void theSearchMileyCyrusMalibuIsDisplayed(String expectedReResult) {
        Assert.assertFalse("ERROR, The video wasn't found",mainActivity.isVideoDisplayed(expectedReResult));
    }

    /*

    @Given("^I hve a admin user$")
    public void iHveAAdminUser() {
        System.out.println("Admin User");
    }

    @When("^I set the (login|pwd) textbox with (.*)$")
    public void iSetTheLoginTexboxWithAdmin1(String typeControl, String value) {
        System.out.println(typeControl+"textbox: ,value: "+ value);
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("click login");
    }

    @Then("^I enter to the application$")
    public void iEnterToTheApplication() {
        System.out.println("verificar");
    }*/

}
