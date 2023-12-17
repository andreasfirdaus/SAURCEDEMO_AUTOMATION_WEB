package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutInformation_page;
import org.example.pageObject.CheckoutOverview_page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutOverview_steps {
    private final WebDriver driver = Hooks.driver;
    CheckoutOverview_page checkoutOverviewPage = new CheckoutOverview_page(driver);


    @Then("User already on checkout page")
    public void verifyCheckOutPage()
    {
        Assert.assertTrue(checkoutOverviewPage.verifyCheckOut());
        System.out.println("welcome check out page");
    }

    @When("User click button finish")
    public void clickButtonFinish()
    {
        checkoutOverviewPage.clickButtonFinish();
    }


    @Then("User see {string} as total price")
    public void verifyTextTotalPrice(String txtTotalPrice)
    {
        Assert.assertEquals(txtTotalPrice, checkoutOverviewPage.getTextTotalPrice());
    }

}
