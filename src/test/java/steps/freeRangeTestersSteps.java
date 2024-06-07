package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.mainPage;

public class freeRangeTestersSteps {
    
    mainPage landingPage = new mainPage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToWeb();
    }

    @When("I click on entrar")
    public void clickEntrar() {
        landingPage.clickOnEntrar();
    }

    @And("Enter my information")
    public void enterInfo(){
        landingPage.myUser();
        landingPage.myPass();
    }
}
