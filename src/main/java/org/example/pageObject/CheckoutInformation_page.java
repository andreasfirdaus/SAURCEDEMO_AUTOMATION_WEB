package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformation_page {

    public static WebDriver webDriver;

    public CheckoutInformation_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    //=======================================================
    @FindBy(xpath ="//input[@id='first-name']")
    private WebElement fieldFirstName;

    @FindBy(xpath ="//input[@id='last-name']")
    private WebElement fieldLastName;

    @FindBy(xpath ="//input[@id='postal-code']")
    private WebElement fieldPostalCode;

    @FindBy(xpath ="//input[@id='continue']")
    private WebElement buttonContinue;
    //=========================================================

    public void inputFieldFirstName(String firstName)
    {
        fieldFirstName.sendKeys(firstName);
    }
    public void inputFieldLastName(String lastName)
    {
        fieldLastName.sendKeys(lastName);
    }

    public void inputFieldPostalCode(String postalCode)
    {
        fieldPostalCode.sendKeys(postalCode);
    }
    public void clickButtonContinue()
    {
        buttonContinue.click();
    }

}
