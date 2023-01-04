package com.qaprosoft.puma.mobile.gui.pages.android.menuitems;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.AddressBookPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.MyAccountPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyAccountPageBase.class)
public class MyAccountPage extends MyAccountPageBase {
    @FindBy(xpath = "//a[@id = 'edit-profile-button']")
    private ExtendedWebElement editProfileBtn;

    @FindBy(xpath = "//a[@id = 'edit-password-button']")
    private ExtendedWebElement changePasswordBtn;

    @FindBy(xpath = "//a[@data-test-id='add-new-address']")
    private ExtendedWebElement addNewBtn;
    @FindBy(xpath = "//button[@data-test-id='account-logout-button']")
    private ExtendedWebElement logoutBtn;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickLogout() {
        logoutBtn.click();
    }

    @Override
    public boolean isLogoutPresent() {
        return logoutBtn.isElementPresent();
    }

    @Override
    public void clickEditProfile() {
        editProfileBtn.click();
    }

    @Override
    public boolean isEditProfilePresent() {
        return editProfileBtn.isElementPresent();
    }

    @Override
    public void clickChangePassword() {
        changePasswordBtn.click();
    }

    @Override
    public boolean isChangePasswordPresent() {
        return changePasswordBtn.isElementPresent();
    }

    @Override
    public AddressBookPageBase clickAddNew() {
        addNewBtn.click();
        return initPage(getDriver(), AddressBookPageBase.class);
    }

    @Override
    public boolean isAddNewBtnPresent() {
        return addNewBtn.isElementPresent();
    }
}
