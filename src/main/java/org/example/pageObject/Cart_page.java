package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
    public static WebDriver webDriver;
    public Cart_page(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        webDriver=driver;
    }


    @FindBy(xpath ="//div[@id='shopping_cart_container']/a[1]")
    private WebElement buttonRemove;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckOut;

    public void clickButtonRemove(String product2)
    {
        String xpaths = "//div[contains(text(),'"+ product2+ "')]/ancestor::div[@class='cart_item']//button[text()='Remove']";
        webDriver.findElement(By.xpath(xpaths)).click();
    }

    public void clickButtonCheckOut()
    {
        buttonCheckOut.click();
    }
}
