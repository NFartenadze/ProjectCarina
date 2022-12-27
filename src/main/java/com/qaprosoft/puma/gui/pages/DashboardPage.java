package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {
    private static final Logger logger = LogManager.getLogger(RegistrationPage.class);

    @FindBy(xpath = "//a[@id = 'edit-profile-button']")
    private ExtendedWebElement editProfile;

    @FindBy(xpath = "//a[@id = 'edit-password-button']")
    private ExtendedWebElement editPassword;

    @FindBy(xpath = "//a[@data-test-id='add-new-address']")
    private ExtendedWebElement addNew;

    public DashboardPage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public AddressBookPage clickAddNew() {
        addNew.click();
        return new AddressBookPage(getDriver());
    }

    public void clickEditPassword() {
        editPassword.click();
    }

    public void clickEditProfile() {
        editProfile.click();
    }


    public boolean isEditProfilePresent() {
        return editProfile.isElementPresent();
    }

    public boolean isEditPasswordPresent() {
        return editPassword.isElementPresent();
    }

    public boolean isAddNewPresent() {
        return addNew.isElementPresent();
    }


}
