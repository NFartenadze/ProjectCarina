package com.qaprosoft.puma.mobile.gui.pages.android.menuitems;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.ReturnPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ReturnPageBase.class)
public class ReturnPage extends ReturnPageBase implements IMobileUtils {
    @FindBy(xpath = "//input[@data-test-id='order-no']")
    private ExtendedWebElement orderNumberField;
    @FindBy(xpath = "//input[@data-test-id='order-email']")
    private ExtendedWebElement emailField;
    @FindBy(xpath = "//input[@data-test-id='billing-postal-code']")
    private ExtendedWebElement postalCodeField;
    @FindBy(xpath = "//button[@data-test-id='submit-button']")
    private ExtendedWebElement submitBtn;

    public ReturnPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeOrderNumber(String s) {
        orderNumberField.type(s);
        hideKeyboard();
    }

    @Override
    public boolean isOrderNumberFieldPresent() {
        return orderNumberField.isElementPresent();
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
    public void typePostalCode(String s) {
        postalCodeField.type(s);
    }

    @Override
    public boolean isPostalCodeFieldPresent() {
        return postalCodeField.isElementPresent();
    }

    @Override
    public void clickSubmit() {
        submitBtn.click();
    }

    @Override
    public boolean isSubmitBtnPresent() {
        return submitBtn.isElementPresent();
    }
}
