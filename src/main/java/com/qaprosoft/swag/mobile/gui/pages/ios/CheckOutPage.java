package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.CheckOutPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.OverViewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckOutPageBase.class)
public class CheckOutPage extends CheckOutPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-First Name\"`]")
    ExtendedWebElement firstNameField;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-Last Name\"`]")
    ExtendedWebElement lastNameField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-Zip/Postal Code\"`]")
    ExtendedWebElement postalCodeField;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-Zip/Postal Code\"`]")
    ExtendedWebElement cancelBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"CONTINUE\"`][2]")
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
    public OverViewPageBase continueCheckout() {
        continueBtn.click();
        return initPage(getDriver(), OverViewPageBase.class);
    }

    @Override
    public boolean isContinueBtnPresent() {
        return continueBtn.isElementPresent();
    }
}
