package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.swag.mobile.gui.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends LoginPageBase {
    @FindBy(xpath = "")
    ExtendedWebElement loginField;
    @FindBy(xpath = "")
    ExtendedWebElement passwordField;
    @FindBy(xpath = "")
    ExtendedWebElement loginBtn;

    //login standard_user/ password secret_sauce
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeLogin(String s) {
        
    }

    @Override
    public boolean isLoginFieldPresent() {
        return false;
    }

    @Override
    public void typePassword(String s) {

    }

    @Override
    public boolean isPasswordFieldPresent() {
        return false;
    }

    @Override
    public void clickLoginBtn() {

    }

    @Override
    public boolean isLoginBtnPresent() {
        return false;
    }
}
