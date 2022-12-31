package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.puma.mobile.gui.pages.common.*;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.LanguagePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.RegistrationPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PumaTests implements IAbstractTest, IMobileUtils {

    @Test
    public void searchItem() throws InterruptedException {
        HomePageBase homePage = new HomePage(getDriver());
        Assert.assertTrue(homePage.isChromePresent(), "Chrome isn't present");
        ChromeHomePageBase chromeHomePage = homePage.openChrome();
        Assert.assertTrue(chromeHomePage.isSearchBarPresent(), "search bar isn't present");
        chromeHomePage.openPuma();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isSearchPresent(), "search bar isn't present");
        SearchPageBase searchPage = navigationBar.openSearchPage();
        Assert.assertTrue(searchPage.isSearchFieldPresent(), "search field isn't present");

        //unable to send ENTER key to open result page
//        ResultPageBase resultPage = searchPage.searchProduct("bag");
//        Assert.assertTrue(resultPage.areElementsPresent(), "searched elements aren't present");
//        resultPage.printResultItemTexts();
    }

    @Test
    public void registerNewAccount() throws InterruptedException {
        HomePageBase homePage = new HomePage(getDriver());
        Assert.assertTrue(homePage.isChromePresent(), "Chrome isn't present");
//        MobileContextUtils contextHelper = new MobileContextUtils();
//        contextHelper.switchMobileContext(MobileContextUtils.View.WEB);
        ChromeHomePageBase chromeHomePage = homePage.openChrome();
        Assert.assertTrue(chromeHomePage.isSearchBarPresent(), "search bar isn't present");
        chromeHomePage.openPuma();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isMenuPresent(), "menu toggle icon isn't present");
        MenuPageBase menuPage = navigationBar.openMenuPage();

        //PROBLEM: fields are sometimes found/not found
        Assert.assertTrue(menuPage.isRegistrationBtnPresent(), "Register button isn't present");
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
        registrationPage.clickRegister();
    }

    @Test
    public void changeLanguage() throws InterruptedException {
        HomePageBase homePage = new HomePage(getDriver());
        Assert.assertTrue(homePage.isChromePresent(), "Chrome isn't present");
        ChromeHomePageBase chromeHomePage = homePage.openChrome();
        Assert.assertTrue(chromeHomePage.isSearchBarPresent(), "search bar isn't present");
        chromeHomePage.openPuma();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isMenuPresent(), "menu toggle icon isn't present");
        MenuPageBase menuPage = navigationBar.openMenuPage();
        Assert.assertTrue(menuPage.isLanguagePresent(), "language isn't present");
        LanguagePageBase languagePage = menuPage.clickLanguage();
        //panel items cannot be interacted with somehow
//        languagePage.searchLanguage(States.ALABAMA);
//        languagePage.selectLanguage();
    }

}