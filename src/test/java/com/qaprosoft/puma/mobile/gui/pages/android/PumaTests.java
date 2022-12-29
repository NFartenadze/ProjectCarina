package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.puma.mobile.gui.pages.common.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PumaTests implements IAbstractTest, IMobileUtils {

    @Test()
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
        ResultPageBase resultPage = searchPage.searchProduct("bag");
        Assert.assertTrue(resultPage.areElementsPresent(), "searched elements aren't present");
        resultPage.printResultItemTexts();
    }

}