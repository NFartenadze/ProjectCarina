package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.puma.mobile.gui.pages.common.AddressBookPageBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractPage {
    private static final Logger logger = LogManager.getLogger(RegistrationPage.class);

    @FindBy(xpath = "//a[@id='edit-profile-button']")
    private ExtendedWebElement editProfile;

    @FindBy(xpath = "//a[@id='edit-password-button']")
    private ExtendedWebElement editPassword;

    @FindBy(xpath = "//a[@data-test-id='add-new-address']")
    private ExtendedWebElement addNew;
    @FindBy(xpath = "//button[@data-test-id='account-logout-button']")
    private ExtendedWebElement logoutBtn;

    public MyAccountPage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public void clickLogout() {
        logoutBtn.click();
    }

    public boolean isLogoutPresent() {
        return logoutBtn.isElementPresent();
    }


    public AddressBookPageBase clickAddNew() {
        addNew.click();
        return initPage(getDriver(), AddressBookPageBase.class);
    }

    public void clickChangePassword() {
        editPassword.click();
    }

    public void clickEditProfile() {
        editProfile.click();
    }


    public boolean isEditProfilePresent() {
        return editProfile.isElementPresent();
    }

    public boolean isChangePasswordPresent() {
        return editPassword.isElementPresent();
    }

    public boolean isAddNewBtnPresent() {
        return addNew.isElementPresent();
    }


}
