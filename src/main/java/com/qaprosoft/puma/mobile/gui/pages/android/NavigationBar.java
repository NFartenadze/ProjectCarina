package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NavigationBarBase.class)
public class NavigationBar extends NavigationBarBase {
    //xpath from web browser
    @FindBy(xpath = "//button[@data-test-id='search-icon-nav']")
    private ExtendedWebElement searchIcon;
    //    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[1]")
//    private ExtendedWebElement searchIcon;
    @FindBy(id = "nav-wishlist-link")
    private ExtendedWebElement wishListIcon;
    @FindBy(id = "nav-cart-link")
    private ExtendedWebElement cartIcon;
    @FindBy(xpath = "//button[@data-test-id='account-button']")
    private ExtendedWebElement menuToggle;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    @Override
    public MenuPageBase openMenuPage() {
        menuToggle.click();
        return initPage(getDriver(), MenuPageBase.class);
    }

    @Override
    public boolean isMenuPresent() {
        return menuToggle.isElementPresent();
    }

    @Override
    public CartPageBase openCartPage() {
        cartIcon.click();
        return initPage(getDriver(), CartPageBase.class);
    }

    @Override
    public boolean isCartPresent() {
        return cartIcon.isElementPresent();
    }

    @Override
    public SearchPageBase openSearchPage() {
        searchIcon.click();
        return initPage(getDriver(), SearchPageBase.class);
    }

    @Override
    public boolean isSearchPresent() {
        return searchIcon.isElementPresent();
    }

    @Override
    public WishListPageBase openWishList() {
        return initPage(getDriver(), WishListPageBase.class);
    }

    @Override
    public boolean isWishListPresent() {
        return wishListIcon.isElementPresent();
    }
}
