package com.qaprosoft.puma.mobile.gui.pages.android.menuitems;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    @FindBy(xpath = "//input[@data-test-id='auth-field-email']")
    private ExtendedWebElement emailField;
    @FindBy(xpath = "//input[@data-test-id='auth-field-password-wrapper']")
    private ExtendedWebElement passwordField;
    @FindBy(xpath = "//label[@data-test-id='auth-field-remember-me']")
    private ExtendedWebElement rememberCredentialsCheckBox;
    @FindBy(xpath = "//button[@data-test-id='auth-button-login']")
    private ExtendedWebElement loginBtn;
    @FindBy(xpath = "//button[@data-test-id='forgotten-password-link']")
    private ExtendedWebElement forgotPasswordBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeEmail(String s) {
        emailField.type(s);
    }

    @Override
    public boolean isEmailFieldPresent() {
        return emailField.isElementPresent();
    }

    @Override
    public void typePassword(String s) {
        passwordField.type(s);
    }

    @Override
    public boolean isPasswordFieldPresent() {
        return passwordField.isElementPresent();
    }

    @Override
    public void checkRememberMe() {
        rememberCredentialsCheckBox.check();
    }

    @Override
    public boolean isRememberMeCheckboxPresent() {
        return rememberCredentialsCheckBox.isElementPresent();
    }

    @Override
    public void clickLogin() {
        loginBtn.click();
    }

    @Override
    public boolean isLoginBtnPresent() {
        return loginBtn.isElementPresent();
    }

    @Override
    public void clickForgottenPassword() {
        forgotPasswordBtn.click();
    }

    @Override
    public boolean isForgotPasswordPresent() {
        return forgotPasswordBtn.isElementPresent();
    }
}
