package com.qaprosoft.puma.mobile.gui.pages.common.menuitems;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ReturnPageBase extends AbstractPage {
    public ReturnPageBase(WebDriver driver) {
        super(driver);
        setPageURL("https://us.puma.com/us/en/returns");
    }

    public abstract void typeOrderNumber(String s);

    public abstract boolean isOrderNumberFieldPresent();

    public abstract void typeEmail(String s);

    public abstract boolean isEmailFieldPresent();

    public abstract void typePostalCode(String s);

    public abstract boolean isPostalCodeFieldPresent();

    public abstract void clickSubmit();

    public abstract boolean isSubmitBtnPresent();

}
