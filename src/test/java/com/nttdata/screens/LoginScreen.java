package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    private WebElement btnClose;

    public void clickClose(){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnClose.click();
    }

    public static By userInput = By.id("login_form_email");
    public static By passInput = By.id("login_form_password");
    public static By loginButton = By.id("login_form__token");
}
