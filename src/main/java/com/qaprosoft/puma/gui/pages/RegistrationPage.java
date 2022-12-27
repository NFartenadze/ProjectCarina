package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {
    private static final Logger logger = LogManager.getLogger(RegistrationPage.class);

    @FindBy(xpath = "//input[@name='firstName']")
    private ExtendedWebElement firstNameField;
    @FindBy(xpath = "//input[@id='last-name']")
    private ExtendedWebElement lastNameField;
    @FindBy(xpath = "//input[@id='email']")
    private ExtendedWebElement emailField;
    @FindBy(xpath = "//input[@id='password']")
    private ExtendedWebElement passwordField;
    @FindBy(xpath = "//button[@data-test-id='register']")
    private ExtendedWebElement registerButton;
    @FindBy(css = "#cookie-banner-close-btn")
    private ExtendedWebElement cookieCloserButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public boolean isFirstNameFieldPresent() {
        return firstNameField.isElementPresent();
    }

    public boolean isLastNameFieldPresent() {
        return lastNameField.isElementPresent();
    }

    public void closeCookie() {
        cookieCloserButton.click();
    }

    public boolean isCookiePresent() {
        return cookieCloserButton.isElementPresent();
    }

    public boolean isEmailFieldPresent() {
        return emailField.isElementPresent();
    }

    public boolean isPasswordFieldPresent() {
        return passwordField.isElementPresent();
    }

    public boolean isRegisterButtonPresent() {
        return registerButton.isElementPresent();
    }

    public void typeFirstName(String s) {
        firstNameField.type(s);
    }

    public void typeLastName(String s) {
        lastNameField.type(s);
    }

    public void typeEmail(String s) {
        emailField.type(s);
    }

    public void typePassword(String s) {
        passwordField.type(s);
    }

    public void clickRegister() {
        registerButton.scrollTo();
        registerButton.click();
    }

    public void fillRegistrationForm(String firstName, String lastName, String email, String password) {
        isFirstNameFieldPresent();
        typeFirstName(firstName);
        typeLastName(lastName);
        typeEmail(email);
        typePassword(password);
    }
}
