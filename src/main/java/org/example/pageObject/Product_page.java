package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Product_page {

    public static WebDriver webDriver;
    public Product_page(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        webDriver=driver;
    }
    @FindBy(xpath ="//select[@class='product_sort_container']")
    private WebElement selectProduct;

    @FindBy(xpath ="//div[@id='shopping_cart_container']/a[1]")
    private WebElement buttonShoppingChart;


    public void sortProduct(String filter)
    {
        Select sort = new Select(selectProduct);
        sort.selectByVisibleText(filter);
    }

    public void clickAddToCartProduct(String product)
    {
        String xpath = "//div[contains(text(),'"+ product+ "')]/ancestor::div[@class='inventory_item']//button[text()='Add to cart']";
        webDriver.findElement(By.xpath(xpath)).click();
    }

    public void clickButtonShoppingChart()
    {
        buttonShoppingChart.click();
    }
}
