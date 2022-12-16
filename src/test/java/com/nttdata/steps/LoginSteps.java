package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {

    private WebDriver driver;

    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginScreen.userInput);
        userInputElement.sendKeys(user);


    }


    public void typePassword(String password){
        this.driver.findElement(LoginScreen.passInput).sendKeys(password);
    }


    public void login(){
        this.driver.findElement(LoginScreen.loginButton).click();
    }

}
