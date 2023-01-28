package com.qaprosoft.swag.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeLogin(String s);

    public abstract boolean isLoginFieldPresent();

    public abstract void typePassword(String s);

    public abstract boolean isPasswordFieldPresent();

    public abstract ProductsPageBase clickLoginBtn();

    public abstract boolean isLoginBtnPresent();
}
