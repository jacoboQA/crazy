package pages;

public class mainPage extends BasePage{
    
    private String sectionLink = "//a[normalize-space()='%s' and @href]";

    public mainPage() {
        super(driver);
    }

    public void navigateToWeb() {
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickOnNavigationBar(String section) {
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);

    }
}

