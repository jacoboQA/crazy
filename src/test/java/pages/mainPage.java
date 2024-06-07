package pages;

public class mainPage extends BasePage{
    
    private String entrarLink = "//a[@class='sc-iKOmoZ lhJKpf']";
    private String userInput = "//input[@id='email']";
    private String userPass = "//input[@id='password']";

    public mainPage() {
        super(driver);
    }

    public void navigateToWeb() {
        navigateTo("https://www.freerangetesters.com");
    }

    
    public void clickOnEntrar() {
        clickElement(entrarLink);
    }

    public void myUser() {
        write(userInput, "hola@bolas.com");
    }

    public void myPass() {
        write(userPass, "1234");
    }
}

