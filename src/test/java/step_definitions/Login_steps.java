package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.Login_page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Login_steps {
    private final WebDriver driver = Hooks.driver;
    Login_page loginpage = new Login_page(driver);

    @Given("User already on login page")
    public void verifyUserName()
    {
        Assert.assertTrue(loginpage.verifyUserName());
    }

    @When("User input {string} as username")
    public void inputFieldUserName(String userName)
    {
        loginpage.inputFieldUserName(userName);
    }

    @And("User input {string} as password")
    public void inputFieldPassword(String password)
    {
        loginpage.inputFieldPassword(password);
    }

    @And("User click button login")
    public void clickButtonLogin()
    {
        loginpage.clickButtonLogin();
    }

    @And("User input {string} as userName and {string} as password")
    public void credential(String userName, String password)
    {
        loginpage.inputFieldUserName(userName);
        loginpage.inputFieldPassword(password);
        loginpage.clickButtonLogin();
    }

    @Then("User already on inventory page")
    public void verifyLabelProduct()
    {
        Assert.assertTrue(loginpage.verifyLabelProduct());
    }

    @Then("User see {string} as error message")
    public void verifyErrorMessage(String erroMessage)
    {
        Assert.assertEquals(erroMessage, loginpage.getErrorMessage());
    }
}
