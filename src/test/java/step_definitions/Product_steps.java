package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.Product_page;
import org.openqa.selenium.WebDriver;

public class Product_steps {

    private final WebDriver driver = Hooks.driver;
    Product_page productPage = new Product_page(driver);

    @When("User sort product by {string}")
    public void sortProduct(String filter)
    {
        productPage.sortProduct(filter);
    }
    @And("User click product {string}")
    public void clickProduct(String product)
    {
        productPage.clickAddToCartProduct(product);
    }

    @And("User click shopping cart")
    public void clickButtonSoppingChart()
    {
        productPage.clickButtonShoppingChart();
    }

}
//
//zeinazhari  to  Everyone 19:07
//https://www.guru99.com/xpath-selenium.html
//
//You  to  Everyone 19:57
//test yang lain kk wkkwk
//
//zeinazhari  to  Everyone 20:01
//Absolut xpath :
//        /html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input
//
//Basic path:
////input[@name='user-name']
//Contains xpath:
////input[contains(@data-test,'name')]
//Or &and path:
////input[@id='user-name' and @name='user-name']
//Starswith path:
////input[starts-with(@data-test,'user')]
//
//Text path:
////div[text()='Swag Labs']
////div[contains(text(),'Swag')]
//
//Following:
////div[@class='error-message-container']/following-sibling::input
//Preceding:
////div[@class='error-message-container']/preceding-sibling::div[2]
////div[@class='error-message-container']/preceding-sibling::div[@class='form_group'][1]
//
//Ancestor :
////div[@class='error-message-container']/ancestor::div[@class='login-box']
//
//zeinazhari  to  Everyone 20:15
//public void clickAddToCartProduct(String product){
//    String xpath = "//div[contains(text(),'"+ product+ "')]/ancestor::div[@class='inventory_item']//button[text()='Add to cart']";
//    webDriver.findElement(By.xpath(xpath)).click();
//}
//
//zeinazhari  to  Everyone 20:25
//@And("User click product {string}")
//public void clickProduct(String product) throws InterruptedException {
//    inventoryPage.clickAddToCartProduct(product);
//    Thread.sleep(5000);
//}
