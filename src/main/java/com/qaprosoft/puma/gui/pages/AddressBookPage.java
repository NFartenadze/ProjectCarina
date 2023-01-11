package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.puma.gui.components.States;
import com.qaprosoft.puma.mobile.gui.pages.android.Countries;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends AbstractPage {
    @FindBy(xpath = "//input[@id='address-title-input']")
    private ExtendedWebElement addressTitleField;
    @FindBy(xpath = "//select[@id='address-form-country-select']")
    private ExtendedWebElement country;
    @FindBy(xpath = "//input[@id='firstName-input']")
    private ExtendedWebElement firstName;
    @FindBy(xpath = "//input[@id='lastName-input']")
    private ExtendedWebElement lastName;
    @FindBy(xpath = "//input[@id='address1']")
    private ExtendedWebElement streetNumber;
    @FindBy(xpath = "//input[@id='address2-input']")
    private ExtendedWebElement companyInfo;
    @FindBy(xpath = "//input[@id='city-input']")
    private ExtendedWebElement city;
    @FindBy(xpath = "//input[@id='postalCode-input']")
    private ExtendedWebElement postalCode;
    @FindBy(xpath = "//select[@id='address-form-state-select']")
    private ExtendedWebElement state;

    @FindBy(xpath = "//input[@id=\"phone-input\"]")
    private ExtendedWebElement phoneNumber;
    @FindBy(xpath = "//button[@data-test-id='add-address-button']")
    private ExtendedWebElement saveButton;

    @FindBy(xpath = "//a[@data-test-id='back-to-account']")
    private ExtendedWebElement backToMyAccountButton;
    @FindBy(xpath = "//input[@type='checkbox' and @id='preferred-address']")
    private ExtendedWebElement makeDefaultCheckBox;


    public AddressBookPage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public void selectState(States s) {
        state.select(s.getState());
    }

    public boolean isPhoneNumberFieldPresent() {
        return phoneNumber.isElementPresent();
    }

    public void typePhoneNumber(String s) {
        phoneNumber.type(s);
    }

    public boolean isPostalCodeFieldPresent() {
        return postalCode.isElementPresent();
    }

    public void clickBackToMyAccountButton() {
        backToMyAccountButton.click();
    }

    public void checkMakeDefault() {
        makeDefaultCheckBox.check();
    }

    public void typeFirstName(String s) {
        firstName.type(s);
    }

    public void typeLastName(String s) {
        lastName.type(s);
    }


    public boolean isFirstNameFieldPresent() {
        return firstName.isElementPresent();
    }

    public boolean isLastNameFieldPresent() {
        return lastName.isElementPresent();
    }

    public boolean isAddressTitleFieldPresent() {
        return addressTitleField.isElementPresent();
    }

    public boolean isStreetNumberFieldPresent() {
        return streetNumber.isElementPresent();
    }

    public boolean isCompanyInfoFieldPresent() {
        return companyInfo.isElementPresent();
    }

    public boolean isSaveBtnPresent() {
        return saveButton.isElementPresent();
    }

    public void clickSaveBtn() {
        saveButton.click();
    }

    public boolean isCityFieldPresent() {
        return city.isElementPresent();
    }

    public void typeStreetNumber(String s) {
        streetNumber.type(s);
    }

    public void typeCompanyInfo(String s) {
        companyInfo.type(s);
    }

    public void typeAddressTitle(String s) {
        addressTitleField.type(s);
    }

    public void typeCity(String s) {
        city.type(s);
    }

    public void typePostalCode(String s) {
        postalCode.type(s);
    }

    public void addNewAddress(String title, Countries country, String firstName, String lastName, String streetNumber, String companyInfo, String city, String postalCode, States state, String phoneNumber) {
        typeAddressTitle(title);
        selectCountry(country.getCountry());
        typeFirstName(firstName);
        typeLastName(lastName);
        typeStreetNumber(streetNumber);
        typeCompanyInfo(companyInfo);
        typeCity(city);
        typePostalCode(postalCode);
        selectState(state);
        typePhoneNumber(phoneNumber);
    }

    public void addNewDefaultAddress(String title, Countries country, String firstName, String lastName, String streetNumber, String companyInfo, String city, String postalCode, States state, String phoneNumber) {
        typeAddressTitle(title);
        selectCountry(country.getCountry());
        typeFirstName(firstName);
        typeLastName(lastName);
        typeStreetNumber(streetNumber);
        typeCompanyInfo(companyInfo);
        typeCity(city);
        typePostalCode(postalCode);
        selectState(state);
        typePhoneNumber(phoneNumber);
        checkMakeDefault();
    }


    public boolean isCountrySelectorPresent() {
        return country.isElementPresent();
    }

    public void selectCountry(String s) {
        country.select(s);
    }


}
