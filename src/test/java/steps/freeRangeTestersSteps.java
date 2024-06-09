package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.mainPage;

public class freeRangeTestersSteps {
    
    mainPage landingPage = new mainPage();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToWeb();
    }

    @When("I go to Cursos using the navigation bar")
    public void navigateToCurso() {
        landingPage.navigateToCursos();
    }

    @And("I select introducción al Testing")
    public void navigateToFundamentos(){
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickIntroduccionTestingLink();
    }
}
