package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.AddressBookPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.MyAccountPageBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends MyAccountPageBase {
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

    @Override
    public void clickLogout() {
        logoutBtn.click();
    }

    @Override
    public boolean isLogoutPresent() {
        return logoutBtn.isElementPresent();
    }


    public AddressBookPageBase clickAddNew() {
        addNew.click();
        return initPage(getDriver(), AddressBookPageBase.class);
    }

    @Override
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
