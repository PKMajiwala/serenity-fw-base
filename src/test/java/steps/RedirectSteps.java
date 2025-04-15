package steps;

import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import io.cucumber.java.en.Given;

public class RedirectSteps {

    @Steps
    HomePage homePage;

    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        homePage.open();
    }
}