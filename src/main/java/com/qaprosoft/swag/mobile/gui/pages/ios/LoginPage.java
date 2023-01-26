package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-Username\"`]")
    ExtendedWebElement loginField;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSecureTextField[`name == \"test-Password\"`]")
    ExtendedWebElement passwordField;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"LOGIN\"`][2]")
    ExtendedWebElement loginBtn;

    //login standard_user/ password secret_sauce
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeLogin(String s) {
        loginField.type(s);
    }

    @Override
    public boolean isLoginFieldPresent() {
        return loginField.isElementPresent();
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
    public void clickLoginBtn() {
        loginBtn.click();
    }

    @Override
    public boolean isLoginBtnPresent() {
        return loginBtn.isElementPresent();
    }
}
