package steps;

import io.cucumber.java.en.Given;
import pages.mainPage;

public class freeRangeTestersSteps {
    
    mainPage landingPage = new mainPage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToWeb();
    }
}
