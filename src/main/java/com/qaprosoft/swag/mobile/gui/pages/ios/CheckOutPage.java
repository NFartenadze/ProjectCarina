package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.CheckOutPageBase;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends CheckOutPageBase {
    @ExtendedFindBy(iosClassChain = "")
    ExtendedWebElement firstNameField;
    @ExtendedFindBy(iosClassChain = "")
    ExtendedWebElement lastNameField;

    @ExtendedFindBy(iosClassChain = "")
    ExtendedWebElement postalCodeField;
    @ExtendedFindBy(iosClassChain = "")
    ExtendedWebElement cancelBtn;

    @ExtendedFindBy(iosClassChain = "")
    ExtendedWebElement continueBtn;

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeFirstName(String firstName) {
        firstNameField.type(firstName);
    }

    @Override
    public boolean isFirstNameFieldPresent() {
        return firstNameField.isElementPresent();
    }

    @Override
    public void typeLastName(String lastName) {
        lastNameField.type(lastName);
    }

    @Override
    public boolean isLastNameFieldPresent() {
        return lastNameField.isElementPresent();
    }

    @Override
    public void typePostalCode(String postalCode) {
        postalCodeField.type(postalCode);
    }

    @Override
    public boolean isPostalCodeFieldPresent() {
        return postalCodeField.isElementPresent();
    }

    @Override
    public void cancelCheckout() {
        cancelBtn.click();
    }

    @Override
    public boolean isCancelBtnPresent() {
        return cancelBtn.isElementPresent();
    }

    @Override
    public void continueCheckout() {
        continueBtn.click();
    }

    @Override
    public boolean isContinueBtnPresent() {
        return continueBtn.isElementPresent();
    }
}
