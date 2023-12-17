package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.Cart_page;
import org.openqa.selenium.WebDriver;

public class Chart_steps {
    private final WebDriver driver = Hooks.driver;
   Cart_page cartPage = new Cart_page(driver);



    @And("User click button remove {string}")
    public void clickRemove(String product2)
    {
        cartPage.clickButtonRemove(product2);
    }

    @And("User click button checkout")
    public void clickButtonCheckOut()
    {
        cartPage.clickButtonCheckOut();
    }

}
