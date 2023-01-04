package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.puma.mobile.gui.pages.common.MenuPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.NavigationBarBase;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.SearchPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.LanguagePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.RegistrationPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PumaTests implements IAbstractTest, IMobileUtils {

    @Test(groups = "android")
    public void searchItem() {
        PumaHomePageBase pumaHomePage = new PumaHomePage(getDriver());
        pumaHomePage.open();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isSearchPresent(), "search bar isn't present");
        SearchPageBase searchPage = navigationBar.openSearchPage();
        Assert.assertTrue(searchPage.isSearchFieldPresent(), "search field isn't present");

        //unable to send ENTER key to open result page
//        ResultPageBase resultPage = searchPage.searchProduct("bag");
//        Assert.assertTrue(resultPage.areElementsPresent(), "searched elements aren't present");
//        resultPage.printResultItemTexts();
    }

    @Test(groups = "android")
    public void registerNewAccount() {
        PumaHomePageBase pumaHomePage = new PumaHomePage(getDriver());
        pumaHomePage.open();
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

    @Test(groups = "android")
    public void changeLanguage() {
        PumaHomePageBase pumaHomePage = new PumaHomePage(getDriver());
        pumaHomePage.open();
        pumaHomePage.closeBanner();
        NavigationBarBase navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isMenuPresent(), "menu toggle icon isn't present");
        MenuPageBase menuPage = navigationBar.openMenuPage();
        Assert.assertTrue(menuPage.isLanguagePresent(), "language isn't present");
        LanguagePageBase languagePage = menuPage.clickLanguage();
//        panel items cannot be interacted with somehow
        languagePage.searchLanguage(States.ALABAMA);
        languagePage.selectLanguage();
    }

    @Test(groups = "android")
    public void webContext() {
        PumaHomePageBase pumaHomePage = initPage(getDriver(), PumaHomePageBase.class);
        pumaHomePage.open();
//        pumaHomePage.closeBanner();
//        MobileContextUtils contextHelper = new MobileContextUtils();
//        contextHelper.switchMobileContext(MobileContextUtils.View.WEB);

        NavigationBarBase navigationBar = initPage(getDriver(), NavigationBarBase.class);
        Assert.assertTrue(navigationBar.isSearchPresent(), "search isn't present");
        navigationBar.openSearchPage();
    }

}