package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.LoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends LoginPageBase {
    @FindBy(xpath = "//input[@id='email']")
    private ExtendedWebElement loginField;
    @FindBy(xpath = "//input[@id='password']")
    private ExtendedWebElement passwordField;
    @FindBy(xpath = "//input[@id='rememberMe']")
    private ExtendedWebElement rememberCredentialsCheckbox;
    @FindBy(xpath = "//button[@id='login-submit']")
    private ExtendedWebElement loginBtn;
    @FindBy(xpath = "//button[@data-test-id='forgotten-password-link']")
    private ExtendedWebElement forgotPasswordBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLogin() {
        loginBtn.click();
    }

    public void typeEmail(String s) {
        loginField.type(s);
    }

    public void typePassword(String s) {
        passwordField.type(s);
    }

    public void checkRememberMe() {
        rememberCredentialsCheckbox.check();
    }

    public void clickForgottenPassword() {
        forgotPasswordBtn.click();
    }

    public boolean isLoginBtnPresent() {
        return loginBtn.isElementPresent();
    }

    public boolean isForgotPasswordPresent() {
        return forgotPasswordBtn.isElementPresent();
    }

    public boolean isRememberMeCheckboxPresent() {
        return rememberCredentialsCheckbox.isElementPresent();
    }

    public boolean isPasswordFieldPresent() {
        return passwordField.isElementPresent();
    }

    public boolean isEmailFieldPresent() {
        return loginField.isElementPresent();
    }

}
