package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.AddressBookPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AddressBookPageBase.class)
public class AddressBookPage extends AddressBookPageBase {
    @FindBy(id = "address-title-input")
    private ExtendedWebElement addressTitleField;
    @FindBy(xpath = "//select[@id='address-form-country-select']")
    private ExtendedWebElement countrySelector;
    @FindBy(id = "firstName-input")
    private ExtendedWebElement firstNameField;
    @FindBy(id = "lastName-input")
    private ExtendedWebElement lastNameField;
    @FindBy(id = "address1")
    private ExtendedWebElement streetNumberSelector;
    @FindBy(id = "address2-input")
    private ExtendedWebElement companyInfoField;
    @FindBy(id = "city-input")
    private ExtendedWebElement cityField;
    @FindBy(id = "postalCode-input")
    private ExtendedWebElement postalCodeField;
    @FindBy(id = "address-form-state-select")
    private ExtendedWebElement stateSelector;
    @FindBy(id = "phone-input")
    private ExtendedWebElement mobileNumberField;
    @FindBy(id = "preferred-address")
    private ExtendedWebElement makeDefaultCheckbox;
    @FindBy(xpath = "//button[@data-test-id='add-address-button']")
    private ExtendedWebElement saveBtn;
    @FindBy(xpath = "//a[@data-test-id='back-to-account']")
    private ExtendedWebElement backToMyAccountBtn;


    public AddressBookPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void selectState(States state) {
        stateSelector.select(state.getState());
    }

    @Override
    public boolean isPhoneNumberFieldPresent() {
        return mobileNumberField.isElementPresent();
    }

    @Override
    public void typePhoneNumber(String s) {
        mobileNumberField.type(s);
    }

    @Override
    public boolean isPostalCodeFieldPresent() {
        return postalCodeField.isElementPresent();
    }

    @Override
    public void clickBackToMyAccountButton() {
        backToMyAccountBtn.click();
    }

    @Override
    public void checkMakeDefault() {
        makeDefaultCheckbox.check();
    }

    @Override
    public void typeFirstName(String s) {
        firstNameField.type(s);
    }

    @Override
    public void typeLastName(String s) {
        lastNameField.type(s);
    }

    @Override
    public boolean isFirstNameFieldPresent() {
        return firstNameField.isElementPresent();
    }

    @Override
    public boolean isLastNameFieldPresent() {
        return lastNameField.isElementPresent();
    }

    @Override
    public boolean isAddressTitleFieldPresent() {
        return addressTitleField.isElementPresent();
    }

    @Override
    public boolean isStreetNumberFieldPresent() {
        return streetNumberSelector.isElementPresent();
    }

    @Override
    public boolean isCompanyInfoFieldPresent() {
        return companyInfoField.isElementPresent();
    }

    @Override
    public boolean isSaveBtnPresent() {
        return saveBtn.isElementPresent();
    }

    @Override
    public void clickSaveBtn() {
        saveBtn.click();
    }

    @Override
    public boolean isCityFieldPresent() {
        return cityField.isElementPresent();
    }

    @Override
    public void typeStreetNumber(String s) {
        streetNumberSelector.select(s);
    }

    @Override
    public void typeCompanyInfo(String s) {
        companyInfoField.type(s);
    }

    @Override
    public void typeAddressTitle(String s) {
        addressTitleField.type(s);
    }

    @Override
    public void typeCity(String s) {
        cityField.type(s);
    }

    @Override
    public void typePostalCode(String s) {
        postalCodeField.type(s);
    }

    @Override
    public boolean isCountrySelectorPresent() {
        return countrySelector.isElementPresent();
    }

    @Override
    public void selectCountry(String s) {
        countrySelector.select(s);
    }
}
