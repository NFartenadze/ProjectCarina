package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.puma.mobile.gui.pages.android.components.PumaAppFrame;
import com.qaprosoft.puma.mobile.gui.pages.android.components.Sections;
import com.qaprosoft.puma.mobile.gui.pages.common.*;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.LanguagePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.RegistrationPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PumaTests implements IAbstractTest, IMobileUtils {

    @Test(groups = "android")
    public void searchItem() {
        PumaHomePageBase pumaHomePage = new PumaHomePage(getDriver());
        pumaHomePage.open();
        pumaHomePage.stayOnRegion();
        pumaHomePage.closeCookiePanel();
        pumaHomePage.closeDiscountBtn();
        PumaAppFrame frame = new PumaAppFrame(getDriver());
        frame.closeAppBanner();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isSearchPresent(), "search bar isn't present");
        SearchPageBase searchPage = navigationBar.openSearchPage();
        Assert.assertTrue(searchPage.isSearchFieldPresent(), "search field isn't present");
        ResultPageBase resultPage = searchPage.searchProduct("bag");
        Assert.assertTrue(resultPage.isPageOpened(), "page isn't opened");
        resultPage.printResultItemTexts();
    }

    @Test(groups = "android")
    public void registerNewAccount() {
        PumaHomePageBase pumaHomePage = new PumaHomePage(getDriver());
        pumaHomePage.open();
        Assert.assertTrue(pumaHomePage.isPageOpened(), "page isn't opened");
        pumaHomePage.stayOnRegion();
        pumaHomePage.closeCookiePanel();
        pumaHomePage.closeDiscountBtn();
        PumaAppFrame frame = new PumaAppFrame(getDriver());
        frame.closeAppBanner();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isMenuPresent(), "menu toggle icon isn't present");
        MenuPageBase menuPage = navigationBar.openMenuPage();
        Assert.assertTrue(menuPage.isRegistrationBtnPresent(), "register button isn't present");
        RegistrationPageBase registrationPage = menuPage.clickRegisterBtn();
        Assert.assertTrue(registrationPage.isFirstNameFieldPresent(), "first name isn't present");
        registrationPage.typeFirstName("example");
        Assert.assertTrue(registrationPage.isLastNameFieldPresent(), "last name isn't present");
        registrationPage.typeLastName("example");
        Assert.assertTrue(registrationPage.isEmailFieldPresent(), "email isn't present");
        registrationPage.typeEmail("example");
        Assert.assertTrue(registrationPage.isPasswordFieldPresent(), "password isn't present");
        registrationPage.typePassword("example");
        Assert.assertTrue(registrationPage.isAddToMailingListCheckboxPresent(), "add to mailing list checkbox isn't present");
        registrationPage.checkAddToMailingList();
        Assert.assertTrue(registrationPage.isRegisterBtnPresent(), "register button isn't present");
//        registrationPage.clickRegister();
    }

    @Test(groups = "android")
    public void changeLanguage() {
        PumaHomePageBase pumaHomePage = new PumaHomePage(getDriver());
        pumaHomePage.open();
        pumaHomePage.stayOnRegion();
        pumaHomePage.closeCookiePanel();
        pumaHomePage.closeDiscountBtn();
        PumaAppFrame frame = new PumaAppFrame(getDriver());
        frame.closeAppBanner();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isMenuPresent(), "menu toggle icon isn't present");
        MenuPageBase menuPage = navigationBar.openMenuPage();
        Assert.assertTrue(menuPage.isLanguagePresent(), "language isn't present");
        LanguagePageBase languagePage = menuPage.clickLanguage();
        languagePage.searchLanguage(Countries.GERMANY);
        languagePage.selectLanguage();
    }

    @Test(groups = "android")
    public void navigateToSection() {
        PumaHomePageBase pumaHomePage = new PumaHomePage(getDriver());
        pumaHomePage.open();
        pumaHomePage.stayOnRegion();
        pumaHomePage.closeCookiePanel();
        pumaHomePage.closeDiscountBtn();
        PumaAppFrame frame = new PumaAppFrame(getDriver());
        frame.closeAppBanner();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isMenuPresent(), "menu toggle icon isn't present");
        MenuPageBase menuPage = navigationBar.openMenuPage();
        Assert.assertTrue(menuPage.isSectionPresent(Sections.MEN), "language isn't present");
        menuPage.navigateToSection(Sections.MEN);
    }


}