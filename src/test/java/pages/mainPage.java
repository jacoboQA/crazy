package pages;

public class mainPage extends BasePage{
    
    private String cursosLink = "//a[normalize-space()='Cursos']";
    private String userInput = "//input[@id='email']";
    private String userPass = "//input[@id='password']";

    public mainPage() {
        super(driver);
    }

    public void navigateToWeb() {
        navigateTo("https://www.freerangetesters.com");
    }

    
    public void navigateToCursos() {
        clickElement(cursosLink);
    }

    public void myUser() {
        write(userInput, "hola@bolas.com");
    }

    public void myPass() {
        write(userPass, "1234");
    }
}

