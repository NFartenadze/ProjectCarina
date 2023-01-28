package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.swag.mobile.gui.pages.common.*;
import com.qaprosoft.swag.mobile.gui.pages.common.components.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Swag implements IAbstractTest {

    @DataProvider(name = "dprovider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {new User("standard_user", "secret_sauce")},
                {new User("locked_out_user", "secret_sauce")},
                {new User("problem_user", "secret_sauce")}
        };
    }


    @Test(dataProvider = "dprovider")
    public void loginTest(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        loginPage.clickLoginBtn();
    }

    @Test(dataProvider = "dprovider")
    public void addItemToCart(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        ProductsPageBase productsPage = loginPage.clickLoginBtn();
        productsPage.addProductToCart(0);
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isCartIconPresent(), "cart icon isn't present");
        CartPageBase cartPage = header.openCartPage();

    }

    @Test(dataProvider = "dprovider")
    public void filterProducts(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        ProductsPageBase productsPage = loginPage.clickLoginBtn();
        Assert.assertTrue(productsPage.isProductViewBtnPresent(), "Product view button isn't present");
        productsPage.changeProductView();
        Assert.assertTrue(productsPage.isFilterIconPresent(), "Filter icon isn't present");
        FilterBase filter = productsPage.openFilter();
        /*
        there are only items starting with S closest to A
        and there are only item starting with T closest to Z
        */
        filter.sortBy(Sort.NAME_Z_TO_A);
//        Assert.assertTrue(productsPage.getProduct(0).getText().startsWith("S"), "Product Title doesn't start with A");
        //getText returns items description not title
    }

    @Test(dataProvider = "dprovider")
    public void checkOutItems(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        ProductsPageBase productsPage = loginPage.clickLoginBtn();
        productsPage.addProductToCart(0);
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isCartIconPresent(), "cart icon isn't present");
        CartPageBase cartPage = header.openCartPage();
        Assert.assertTrue(cartPage.isCheckOutBtnPresent(), "checkout button isn' present");
        CheckOutPageBase checkOutPage = cartPage.checkOut();
        Assert.assertTrue(checkOutPage.isFirstNameFieldPresent(), "First Name Field isn't present");
        checkOutPage.typeFirstName("Bob");
        Assert.assertTrue(checkOutPage.isLastNameFieldPresent(), "Last Name Field isn't present");
        checkOutPage.typeLastName("Smith");
        Assert.assertTrue(checkOutPage.isPostalCodeFieldPresent(), "Postal Code Field isn't present");
        checkOutPage.typePostalCode("12312");
        Assert.assertTrue(checkOutPage.isContinueBtnPresent(), "continue button isn't present");
        OverViewPageBase overViewPage = checkOutPage.continueCheckout();
        Assert.assertTrue(overViewPage.isFinishBtnPresent(), "finish button isn't present");
        overViewPage.finishCheckout();
    }

    @Test(dataProvider = "dprovider")
    public void logoutTest(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        loginPage.clickLoginBtn();
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isSideBarBtnPresent(), "side bar button isn't present");
        SideNavigationBase sideNavigation = header.openSideBar();
        Assert.assertTrue(sideNavigation.isLogOutBtnPresent(), "log out button isn't present");
        sideNavigation.logOut();
    }

    public void test1(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        loginPage.clickLoginBtn();
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isSideBarBtnPresent(), "side bar button isn't present");
        SideNavigationBase sideNavigation = header.openSideBar();
        Assert.assertTrue(sideNavigation.isWebViewPageLinkPresent(), "drawing link  isn't present");
        sideNavigation.openWebViewPage();
    }

    public void qrScannerPageTest(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        loginPage.clickLoginBtn();
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isSideBarBtnPresent(), "side bar button isn't present");
        SideNavigationBase sideNavigation = header.openSideBar();
        Assert.assertTrue(sideNavigation.isQRScannerPageLinkPresent(), "Qr scanner link  isn't present");
        sideNavigation.openQRScannerPage();
    }

    public void geoLocationTest(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        loginPage.clickLoginBtn();
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isSideBarBtnPresent(), "side bar button isn't present");
        SideNavigationBase sideNavigation = header.openSideBar();
        Assert.assertTrue(sideNavigation.isGeoLocationPageLinkPresent(), "Geo Location link  isn't present");
        sideNavigation.openGeoLocationPage();
    }

    public void aboutPageTest(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        loginPage.clickLoginBtn();
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isSideBarBtnPresent(), "side bar button isn't present");
        SideNavigationBase sideNavigation = header.openSideBar();
        Assert.assertTrue(sideNavigation.isAboutPageLinkPresent(), "about link  isn't present");
        sideNavigation.openAboutPage();
    }

    public void drawingPageTest(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        loginPage.clickLoginBtn();
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isSideBarBtnPresent(), "side bar button isn't present");
        SideNavigationBase sideNavigation = header.openSideBar();
        Assert.assertTrue(sideNavigation.isDrawingPageLinkPresent(), "drawing link  isn't present");
        sideNavigation.openDrawingPage();
    }

    public void resetAppStateTest(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        loginPage.clickLoginBtn();
        HeaderBase header = initPage(getDriver(), HeaderBase.class);
        Assert.assertTrue(header.isSideBarBtnPresent(), "side bar button isn't present");
        SideNavigationBase sideNavigation = header.openSideBar();
        Assert.assertTrue(sideNavigation.isResetAppStatePresent(), "drawing link  isn't present");
        sideNavigation.resetAppState();
    }
}
