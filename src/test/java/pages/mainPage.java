package pages;

public class mainPage extends BasePage{
    
    private String sectionLink = "//a[@class='sc-dJGMql hzdFYM sc-dmXWDj sc-dsAqUS tfvmG ffllvE'][normalize-space()='Cursos']";

    public mainPage() {
        super(driver);
    }

    public void navigateToWeb() {
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickOnNavigationBar() {
        clickElement(sectionLink);
    }
}

