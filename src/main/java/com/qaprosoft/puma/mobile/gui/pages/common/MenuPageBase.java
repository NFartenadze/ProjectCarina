package com.qaprosoft.puma.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.puma.mobile.gui.pages.android.components.Sections;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.*;
import org.openqa.selenium.WebDriver;

public abstract class MenuPageBase extends AbstractPage {
    public MenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isSectionPresent(Sections s);

    public abstract void navigateToSection(Sections s);

    public abstract MyAccountPageBase clickMyAccount();

    public abstract boolean isMyAccountPresent();

    public abstract ReturnPageBase clickInitiateReturn();

    public abstract boolean isInitiateReturnPresent();

    public abstract SupportPageBase clickSupport();

    public abstract boolean isSupportPresent();

    public abstract WishListPageBase clickWishList();

    public abstract boolean isWishListPresent();

    public abstract LanguagePageBase clickLanguage();

    public abstract boolean isLanguagePresent();

    public abstract LoginPageBase clickLoginBtn();

    public abstract boolean isLoginBtnPresent();

    public abstract RegistrationPageBase clickRegisterBtn();

    public abstract boolean isRegistrationBtnPresent();


}
