package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
    public static WebDriver webDriver;

    public Login_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath ="//input[@id='user-name']")
    private WebElement fieldUserName;

    @FindBy(id ="password")
    private WebElement fieldPassword;

    @FindBy(xpath ="//input[@id='login-button']")
    private WebElement buttonLogin;

    @FindBy(xpath ="//span[@class='title']")
    private WebElement labelProduct;

    @FindBy(xpath = "//h3")
    private WebElement errorMessage;

    // method input username
    public void inputFieldUserName(String username)
    {
        fieldUserName.sendKeys(username);
        // metode sendKeys selenium adalah mengirim teks / mengisi nilai
        // untuk isi teks atau nilai nya , dimasukkan di variable username
        // disini username isinya masi kosong, nanti isinya dibuat di test case (login.feature)
    }
    public void inputFieldPassword(String password)
    {
        fieldPassword.sendKeys(password);
    }
    public void clickButtonLogin()
    {
        buttonLogin.click();
    }

    public boolean verifyUserName()
    {
        return fieldUserName.isDisplayed();
    }

    public boolean verifyLabelProduct()
    {
        return labelProduct.isDisplayed();
    }


    public String getErrorMessage()
    {
        return errorMessage.getText();
    }



}
