package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.puma.mobile.gui.pages.android.components.PumaAppFrame;
import com.qaprosoft.puma.mobile.gui.pages.android.components.Sections;
import com.qaprosoft.puma.mobile.gui.pages.common.*;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.ItemPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.LanguagePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.RegistrationPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.SupportPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PumaTests implements IAbstractTest, IMobileUtils {


    @Test
    public void searchItem() {
        PumaHomePageBase pumaHomePage = initPage(getDriver(), PumaHomePageBase.class);
        pumaHomePage.open();
        pumaHomePage.stayOnRegion();
        pumaHomePage.closeCookiePanel();
        pumaHomePage.closeDiscountBtn();
        PumaAppFrame frame = new PumaAppFrame(getDriver());
        frame.closeAppBanner();
        NavigationBarBase navigationBar = initPage(getDriver(), NavigationBarBase.class);
        Assert.assertTrue(navigationBar.isSearchPresent(), "search bar isn't present");
        SearchPageBase searchPage = navigationBar.openSearchPage();
        Assert.assertTrue(searchPage.isSearchFieldPresent(), "search field isn't present");
        ResultPageBase resultPage = searchPage.searchProduct("bag");
        Assert.assertTrue(resultPage.isPageOpened(), "page isn't opened");
        resultPage.printResultItemTexts();
    }

    @Test
    public void addItemToCart() {
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
        ItemPageBase itemPage = resultPage.selectSearchedItem(0);
        Assert.assertTrue(itemPage.isCartBtnPresent(), "Cart Button isn't present");
        itemPage.addToCart();
    }

    @Test
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

    @Test
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

    @Test
    public void navigateToSection() {
        PumaHomePageBase pumaHomePage = initPage(getDriver(), PumaHomePageBase.class);
        pumaHomePage.open();
        pumaHomePage.stayOnRegion();
        pumaHomePage.closeCookiePanel();
        pumaHomePage.closeDiscountBtn();
        PumaAppFrame frame = new PumaAppFrame(getDriver());
        frame.closeAppBanner();
        NavigationBarBase navigationBar = initPage(getDriver(), NavigationBarBase.class);
        Assert.assertTrue(navigationBar.isMenuPresent(), "menu toggle icon isn't present");
        MenuPageBase menuPage = navigationBar.openMenuPage();
        Assert.assertTrue(menuPage.isSectionPresent(Sections.MEN), "language isn't present");
        menuPage.navigateToSection(Sections.MEN);

    }

    @Test
    public void getContactInformation() {
        PumaHomePageBase pumaHomePage = initPage(getDriver(), PumaHomePageBase.class);
        pumaHomePage.open();
        pumaHomePage.stayOnRegion();
        pumaHomePage.closeCookiePanel();
        pumaHomePage.closeDiscountBtn();
        PumaAppFrame frame = new PumaAppFrame(getDriver());
        frame.closeAppBanner();
        NavigationBarBase navigationBar = initPage(getDriver(), NavigationBarBase.class);
        Assert.assertTrue(navigationBar.isMenuPresent(), "menu toggle icon isn't present");
        MenuPageBase menuPage = navigationBar.openMenuPage();
        Assert.assertTrue(menuPage.isSupportPresent(), "Support link isn't present");
        SupportPageBase supportPage = menuPage.clickSupport();
        Assert.assertTrue(supportPage.isEmailPresent(), "Email isn't present");
        Assert.assertEquals(supportPage.getEmail(), "customerservice.us@puma.com");
        Assert.assertTrue(supportPage.isNumberPresent(), "Number isn't present");
    }

//    @Test
//    public void submitOrderReturnRequest() {
//        PumaHomePageBase pumaHomePageBase = initPage(getDriver(), PumaHomePageBase.class);
//        ReturnPageBase returnPage = initPage(getDriver(), ReturnPageBase.class);
//        returnPage.open();
//        pumaHomePageBase.stayOnRegion();
//        pumaHomePageBase.closeCookiePanel();
//        pumaHomePageBase.closeDiscountBtn();
//        PumaAppFrame appFrame = new PumaAppFrame(getDriver());
//        appFrame.closeAppBanner();
//        Assert.assertTrue(returnPage.isPageOpened(), "return page isn't opened");
//        Assert.assertTrue(returnPage.isOrderNumberFieldPresent(), "order number field isn't present");
//        returnPage.typeOrderNumber("123123");
//        Assert.assertTrue(returnPage.isEmailFieldPresent(), "email field isn't present");
//        returnPage.typeEmail("Email@Gmail.com");
//        Assert.assertTrue(returnPage.isPostalCodeFieldPresent(), "postal code field isn't present");
//        returnPage.typePostalCode("97979");
//        Assert.assertTrue(returnPage.isSubmitBtnPresent(), "submit button isn't present");
//        returnPage.clickSubmit();
//    }

    //safari doesn't recognise Web xpaths
//    @Test(groups = "ios")
//    public void ios() {
//        PumaHomePageBase pumaHomePage = initPage(getDriver(), PumaHomePageBase.class);
//        pumaHomePage.open();
//        pumaHomePage.stayOnRegion();
//        pumaHomePage.closeCookiePanel();
////        pumaHomePage.closeDiscountBtn();
////        Assert.assertTrue(pumaHomePage.isPageOpened(), "puma home page isn't opened");
////        pumaHomePage.closeCookiePanel();
//        NavigationBarBase navigationBar = pumaHomePage.getNavigationBar();
//        Assert.assertTrue(navigationBar.isSearchPresent(), "search icon isn't present");
//        navigationBar.openSearchPage();
//    }


}