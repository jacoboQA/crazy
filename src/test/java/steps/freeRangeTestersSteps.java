package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.mainPage;

public class freeRangeTestersSteps {
    
    mainPage landingPage = new mainPage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToWeb();
    }

    @When("I go to a section using the navigation bar")
    public void navigationBarUse() {
        landingPage.clickOnNavigationBar();
    }
}
