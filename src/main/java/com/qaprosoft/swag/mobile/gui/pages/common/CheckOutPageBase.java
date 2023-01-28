package com.qaprosoft.swag.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CheckOutPageBase extends AbstractPage {
    public CheckOutPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeFirstName(String firstName);

    public abstract boolean isFirstNameFieldPresent();

    public abstract void typeLastName(String lastName);

    public abstract boolean isLastNameFieldPresent();

    public abstract void typePostalCode(String postalCode);

    public abstract boolean isPostalCodeFieldPresent();

    public abstract void cancelCheckout();

    public abstract boolean isCancelBtnPresent();

    public abstract void continueCheckout();

    public abstract boolean isContinueBtnPresent();
}
