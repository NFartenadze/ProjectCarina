package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.puma.gui.components.States;
import com.qaprosoft.puma.mobile.gui.pages.common.AddressBookPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AddressBookPageBase.class)
public class AddressBookPage extends AddressBookPageBase {
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement addressTitleField;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement countrySelector;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement firstNameField;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement lastNameField;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement streetNumberSelector;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement companyInfoField;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement cityField;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement postalCodeField;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement stateSelector;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement mobileNumberField;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement makeDefaultCheckbox;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement saveBtn;
    @ExtendedFindBy(iosClassChain = "")
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
