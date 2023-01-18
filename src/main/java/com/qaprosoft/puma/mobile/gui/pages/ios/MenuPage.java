package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.puma.mobile.gui.pages.android.components.Sections;
import com.qaprosoft.puma.mobile.gui.pages.common.MenuPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.WishListPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MenuPageBase.class)
public class MenuPage extends MenuPageBase implements IMobileUtils {

    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement section;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement myAccount;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement initiateReturn;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement support;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement wishList;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement language;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement loginBtn;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement registerBtn;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement container;


    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isSectionPresent(Sections s) {
        return section.format(s.getSection()).isElementPresent();
    }

    @Override
    public void navigateToSection(Sections s) {
        section.format(s.getSection()).click();
    }


    @Override
    public MyAccountPageBase clickMyAccount() {
        myAccount.click();
        return initPage(getDriver(), MyAccountPageBase.class);
    }

    @Override
    public boolean isMyAccountPresent() {
        return myAccount.isElementPresent();
    }

    @Override
    public ReturnPageBase clickInitiateReturn() {
        initiateReturn.click();
        return initPage(getDriver(), ReturnPageBase.class);
    }

    @Override
    public boolean isInitiateReturnPresent() {
        return initiateReturn.isElementPresent();
    }

    @Override
    public SupportPageBase clickSupport() {
        support.click();
        return initPage(getDriver(), SupportPageBase.class);

    }

    @Override
    public boolean isSupportPresent() {
        return support.isElementPresent();
    }

    @Override
    public WishListPageBase clickWishList() {
        wishList.click();
        return initPage(getDriver(), WishListPageBase.class);
    }

    @Override
    public boolean isWishListPresent() {
        return wishList.isElementPresent();
    }

    @Override
    public LanguagePageBase clickLanguage() {
        language.scrollTo();
        language.click();
        return initPage(getDriver(), LanguagePageBase.class);
    }

    @Override
    public boolean isLanguagePresent() {
        return language.isElementPresent();
    }

    @Override
    public LoginPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), LoginPageBase.class);
    }

    @Override
    public boolean isLoginBtnPresent() {
        return loginBtn.isElementPresent();
    }

    @Override
    public RegistrationPageBase clickRegisterBtn() {
        swipeUp(5);
        registerBtn.click();
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public boolean isRegistrationBtnPresent() {
        return registerBtn.isElementPresent();
    }
}
