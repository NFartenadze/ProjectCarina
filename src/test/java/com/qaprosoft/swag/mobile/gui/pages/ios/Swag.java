package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.swag.mobile.gui.pages.common.CartPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.ProductsPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.FilterBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.HeaderBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.Sort;
import com.qaprosoft.swag.mobile.gui.pages.common.components.User;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Swag implements IAbstractTest {

    @DataProvider(name = "dprovider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {new User("standard_user", "secret_sauce")},
                {new User("locked_out_user", "secret_sauce")},
                {new User("problem_user", "secret_sauce")}};
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
    public void test(User user) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isLoginFieldPresent(), "email field isn't present");
        loginPage.typeLogin(user.getUserName());
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "password field isn't present");
        loginPage.typePassword(user.getPassword());
        Assert.assertTrue(loginPage.isLoginBtnPresent(), "login button isn't present");
        ProductsPageBase productsPage = loginPage.clickLoginBtn();
    }
}
