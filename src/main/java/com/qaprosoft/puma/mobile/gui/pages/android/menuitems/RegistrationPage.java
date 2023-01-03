package com.qaprosoft.puma.mobile.gui.pages.android.menuitems;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.RegistrationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = RegistrationPageBase.class)
public class RegistrationPage extends RegistrationPageBase implements IMobileUtils {
    @FindBy(xpath = "//android.view.View[4]/android.view.View[2]/android.widget.EditText")
    private ExtendedWebElement firstNameField;
    @FindBy(xpath = "//android.view.View[3]/android.view.View[5]/android.widget.EditText")
    private ExtendedWebElement lastNameField;
    @FindBy(xpath = "//android.view.View[3]/android.view.View[8]/android.widget.EditText")
    private ExtendedWebElement emailField;
    @FindBy(xpath = "//android.view.View[3]/android.view.View[11]/android.widget.EditText")
    private ExtendedWebElement passwordField;
    @FindBy(xpath = "//android.view.View[3]/android.widget.CheckBox")
    private ExtendedWebElement addToEmailListCheckBox;
    @FindBy(xpath = "//android.view.View/android.view.View[3]/android.widget.Button")
    private ExtendedWebElement registerBtn;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeFirstName(String s) {
        firstNameField.type(s);
    }

    @Override
    public boolean isFirstNameFieldPresent() {
        return firstNameField.isElementPresent();
    }

    @Override
    public void typeLastName(String s) {
        lastNameField.type(s);
    }

    @Override
    public boolean isLastNameFieldPresent() {
        return lastNameField.isElementPresent();
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
    public void typePassword(String s) {
        passwordField.type(s);
    }

    @Override
    public boolean isPasswordFieldPresent() {
        return passwordField.isElementPresent();
    }

    @Override
    public void checkAddToMailingList() {
        addToEmailListCheckBox.check();
    }

    @Override
    public boolean isAddToMailingListCheckboxPresent() {
        return addToEmailListCheckBox.isElementPresent();
    }

    @Override
    public void clickRegister() {
        registerBtn.click();
    }

    @Override
    public boolean isRegisterBtnPresent() {
        return registerBtn.isElementPresent();
    }
}
