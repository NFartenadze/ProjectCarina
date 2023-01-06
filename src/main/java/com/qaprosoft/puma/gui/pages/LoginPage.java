package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//input[@id=\"email\"]")
    private ExtendedWebElement loginField;
    @FindBy(xpath = "//input[@id=\"password\"]")
    private ExtendedWebElement passwordField;
    @FindBy(xpath = "//input[@id=\"rememberMe\"]")
    private ExtendedWebElement rememberCredentialsCheckbox;
    @FindBy(xpath = "//button[@id=\"login-submit\"]")
    private ExtendedWebElement loginBtn;
    @FindBy(xpath = "//button[@data-test-id=\"forgotten-password-link\"]")
    private ExtendedWebElement forgotPasswordBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void typeLogin(String s) {
        loginField.type(s);
    }

    public void typePassword(String s) {
        passwordField.type(s);
    }

    public void checkRememberCredentials() {
        rememberCredentialsCheckbox.check();
    }

    public void clickForgotPasswordBtn() {
        forgotPasswordBtn.click();
    }

    public boolean isLoginBtnPresent() {
        return loginBtn.isElementPresent();
    }

    public boolean isForgotPasswordBtnPresent() {
        return forgotPasswordBtn.isElementPresent();
    }

    public boolean isRememberCredentialsCheckboxPresent() {
        return rememberCredentialsCheckbox.isElementPresent();
    }

    public boolean isPasswordFieldPresent() {
        return passwordField.isElementPresent();
    }

    public boolean isLoginFieldPresent() {
        return loginField.isElementPresent();
    }

}
