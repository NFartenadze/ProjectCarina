package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.puma.gui.components.AccountPanel;
import com.qaprosoft.puma.gui.components.LanguagePanel;
import com.qaprosoft.puma.gui.components.NavigationBar;
import com.zebrunner.agent.core.annotation.TestRailCaseId;
import com.zebrunner.agent.core.registrar.TestRail;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Puma implements IAbstractTest {


    @BeforeSuite
    public void setUp() {
        TestRail.setSuiteId("172");
        TestRail.setRunName("Nika");
        TestRail.setAssignee("Nika Fartenadze");
    }


    @Test
    @TestRailCaseId("3430")
    public void search() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "home page isn't opened");
        homePage.fullScreen();
        homePage.stayOnRegion();
        homePage.closeCookiePanel();
        homePage.closeDiscountBtn();
        NavigationBar navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isSearchBarPresent(), "search bar isn't present");
        navigationBar.typeInSearchBar("Bag");
        ResultPage resultPage = navigationBar.clickSearch();
        Assert.assertTrue(resultPage.isPageOpened(), "result page isn't opened");
        resultPage.printResultItemTexts();
        Assert.assertEquals(resultPage.getAmountOfItems(), 24);
    }


    @Test
    @TestRailCaseId("3431")
    public void addItemToCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.fullScreen();
        Assert.assertTrue(homePage.isPageOpened(), "home page isn't opened");
        homePage.stayOnRegion();
        homePage.closeCookiePanel();
        homePage.closeDiscountBtn();
        NavigationBar navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isSearchBarPresent(), "search bar isn't present");
        navigationBar.typeInSearchBar("shoes");
        ResultPage resultPage = navigationBar.clickSearch();
        Assert.assertTrue(resultPage.isPageOpened(), "result pae isn't opened");
        resultPage.selectSearchedItem(123123); //custom created bug
        ItemPage itemPage = new ItemPage(getDriver());
        itemPage.addToCart();
    }

    @Test
    @TestRailCaseId("3432")
    public void registration() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "home page isn't opened");
        homePage.stayOnRegion();
        homePage.closeCookiePanel();
        homePage.closeDiscountBtn();
        //accessing navbar
        NavigationBar navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isAccountButtonPresent(), "Account button isn't present");

        //opening account panel
        AccountPanel accountPanel = navigationBar.clickAccountButton();
        Assert.assertTrue(accountPanel.isRegisterButtonPresent(), "Register button isn't present");
        //opening registration page
        RegistrationPage registrationPage = accountPanel.clickRegisterButton();
//            registrationPage.fillRegistrationForm("asdasd","asdasd","asdasd","Asdasd");
        Assert.assertTrue(registrationPage.isFirstNameFieldPresent(), "first name field isn't present");
        registrationPage.typeFirstName("john");
        Assert.assertTrue(registrationPage.isLastNameFieldPresent(), "last name field isn't present");
        registrationPage.typeLastName("Doe");
        Assert.assertTrue(registrationPage.isEmailFieldPresent(), "email field isn't present");
        registrationPage.typeEmail("john1148@gmail.com");
        Assert.assertTrue(registrationPage.isPasswordFieldPresent(), "password field isn't present");
        registrationPage.typePassword("john11");
        Assert.assertTrue(registrationPage.isRegisterBtnPresent(), "register button isn't present");
        registrationPage.clickRegister();
    }

    @Test
    public void navigateToWomenShoesSection() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "home page isn't opened");
        homePage.stayOnRegion();
        homePage.closeCookiePanel();
        homePage.closeDiscountBtn();
        NavigationBar navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isWomenLinkPresent(), "Woman Link isn't present");
        navigationBar.hoverWomenLink();
        Assert.assertTrue(navigationBar.isShoesElementPresent(), "shoes isn't present");
        navigationBar.clickShoes();
    }

    @Test
    @TestRailCaseId("3433")
    public void changeLanguage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "home page isn't opened");
        homePage.stayOnRegion();
        homePage.closeCookiePanel();
        homePage.closeDiscountBtn();
        //accessing navigation bar
        NavigationBar navigationBar = new NavigationBar(getDriver());
        Assert.assertTrue(navigationBar.isAccountButtonPresent(), "Account button isn't present");

        //opening account panel
        AccountPanel accountPanel = navigationBar.clickAccountButton();
        Assert.assertTrue(accountPanel.isLanguagePresent(), "Language isn't present");
        //opening language panel
        LanguagePanel languagePanel = accountPanel.clickLanguage();
        Assert.assertTrue(languagePanel.isSearchFieldPresent(), "Search field is missing");
        languagePanel.typeInSearch("spanish");
        Assert.assertTrue(languagePanel.isSearchButtonPresent());
        languagePanel.clickSearchButton();
        Assert.assertTrue(languagePanel.checkResult());
        languagePanel.clickSearchedLanguage();
    }


    //network error while trying to login
//    @Test
//    public void addNewAddress() throws IOException {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.open();
////            Assert.assertTrue(homePage.isPageOpened(),"home page isn't opened");
//        homePage.clickStayOnRegion();
//        homePage.closeCookiePanel();
//        homePage.closeDiscountBtn();
//        NavigationBar navigationBar = new NavigationBar(getDriver());
//        Assert.assertTrue(navigationBar.isAccountButtonPresent(), "Account button isn't present");
//
//        //account panel
//        AccountPanel accountPanel = navigationBar.clickAccountButton();
//        Assert.assertTrue(accountPanel.isLoginButtonPresent(), "login button isn't present");
//
//        //login page
//        LoginPage loginPage = accountPanel.clickLoginButton();
//        Assert.assertTrue(loginPage.isLoginFieldPresent(), "login field isn't present");
//        loginPage.typeLogin("john1148@gmail.com");
//        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
//        loginPage.typePassword("john1148");
//        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
//        loginPage.clickLoginBtn();
//        Assert.assertTrue(navigationBar.isAccountButtonPresent(), "Account button isn't present");
//        navigationBar.clickAccountButton();
//
//        Assert.assertTrue(accountPanel.isMenuItemPresent(AccountPanel.MenuItems.MY_ACCOUNT), "My Account isn't present");
//        accountPanel.clickMenuItem(AccountPanel.MenuItems.MY_ACCOUNT);
//
//        //account dashboard page
//        DashboardPage dashboardPage = new DashboardPage(getDriver());
//        Assert.assertTrue(dashboardPage.isPageOpened(), "dashboard page isn't opened");
//        Assert.assertTrue(dashboardPage.isAddNewPresent(), "add new button isn't present");
//
//        //address book page
//        AddressBookPage addressBookPage = dashboardPage.clickAddNew();
////            addressBookPage.addNewAddress("Default", AddressBookPage.Countries.CANADA,"john","doe","12123",
////                    "etc","smt","123123",States.ALASKA,"1312312312");
//        Assert.assertTrue(addressBookPage.isAddressTitleFieldPresent(), "address title field isn't present");
//        addressBookPage.typeAddressTitle("example");
//        addressBookPage.selectCountry(2);
//        Assert.assertTrue(addressBookPage.isFirstNameFieldPresent(), "first name field isn't present");
//        addressBookPage.typeFirstName("example");
//        Assert.assertTrue(addressBookPage.isLastNameFieldPresent(), "last name field isn't present");
//        addressBookPage.typeLastName("example");
//        Assert.assertTrue(addressBookPage.isStreetNumberFieldPresent(), "street number field isn't present");
//        addressBookPage.typeStreetNumber("example");
//        Assert.assertTrue(addressBookPage.isCompanyInfoFieldPresent(), "address title field isn't present");
//        addressBookPage.typeCompanyInfo("example");
//        Assert.assertTrue(addressBookPage.isCityFieldPresent(), "address title field isn't present");
//        addressBookPage.typeCity("example");
//        Assert.assertTrue(addressBookPage.isPostalCodeFieldPresent(), "address title field isn't present");
//        addressBookPage.typePostalCode("example");
//        addressBookPage.selectState(States.ILLINOIS);
//        Assert.assertTrue(addressBookPage.isPhoneNumberFieldPresent(), "address title field isn't present");
//        addressBookPage.typePhoneNumber("5555555555");
//        Assert.assertTrue(addressBookPage.isSaveBtnPresent(), "address title field isn't present");
//        addressBookPage.clickSaveBtn();
//    }


}