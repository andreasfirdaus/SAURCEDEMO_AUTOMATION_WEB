package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.CheckoutInformation_page;
import org.example.pageObject.CheckoutOverview_page;
import org.openqa.selenium.WebDriver;

public class CheckoutInformation_steps {

    private final WebDriver driver = Hooks.driver;
    CheckoutInformation_page checkoutInformationPage = new CheckoutInformation_page(driver);


    @And("User input {string} as firstName and {string} as lastName and {string} as postalCode")
    public void credential(String firstName, String lastName, String postalCode)
    {
        checkoutInformationPage.inputFieldFirstName(firstName);
        checkoutInformationPage.inputFieldLastName(lastName);
        checkoutInformationPage.inputFieldPostalCode(postalCode);
        checkoutInformationPage.clickButtonContinue();
    }
}
