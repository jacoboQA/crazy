package pages;

public class mainPage extends BasePage{
    
    private String cursosLink = "//a[normalize-space()='Cursos' and @href]";
    private String planLink = "//a[normalize-space()='Elegir Plan' and @href]";

    public mainPage() {
        super(driver);
    }

    public void navigateToWeb() {
        navigateTo("https://www.freerangetesters.com");
    }

    
    public void navigateToCursos() {
        clickElement(cursosLink);
    }

    public void clickElegirPlan(){
        clickElement(planLink);
    }
}

