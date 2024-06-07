package pages;

public class mainPage extends BasePage{
    
    public mainPage() {
        super(driver);
    }

    public void navigateToWeb() {
        navigateTo("https://www.freerangetesters.com");
    }

}

