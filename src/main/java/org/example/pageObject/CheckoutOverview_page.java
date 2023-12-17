package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverview_page {
    public static WebDriver webDriver;

    public CheckoutOverview_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath ="//span[@class='title']")
    private WebElement textVerifiedCheckOut;

    @FindBy(id ="finish")
    private WebElement buttonFinish;

    @FindBy(xpath ="//div[@class='summary_info_label summary_total_label']")
    private WebElement txtTotalPrice;

    @FindBy(id ="//div[@class='summary_tax_label']")
    private WebElement txtTax;

    @FindBy(id ="//div[@class='summary_subtotal_label']")
    private WebElement txtItemTotal;

    @FindBy(id ="//div[@class='inventory_item_price']")
    private WebElement txtPriceProduct;

    public boolean verifyCheckOut()
    {
        return textVerifiedCheckOut.isDisplayed();
    }

    public void clickButtonFinish()
    {
        buttonFinish.click();
    }

    public String getTextTotalPrice()
    {
        return txtTotalPrice.getText();
    }
    public boolean verifyTotalPrice()
    {
        return txtTotalPrice.isDisplayed();
    }





}
