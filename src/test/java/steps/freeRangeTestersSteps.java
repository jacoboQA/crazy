package steps;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.checkoutPage;
import pages.mainPage;
import java.util.*;
import org.testng.asserts.SoftAssert;

public class freeRangeTestersSteps {
    
    SoftAssert soft = new SoftAssert();

    mainPage landingPage = new mainPage();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    checkoutPage paginaRegistro = new checkoutPage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToWeb();
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickElegirPlan();
    }

    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans(){
        List<String> lista = paginaRegistro.returnPlanDropdowValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 12 productos","Academia: $176 / año • 12 productos","Free: Gratis • 3 productos");
        soft.assertEquals(listaEsperada, lista);
        soft.assertAll();
    }

}
