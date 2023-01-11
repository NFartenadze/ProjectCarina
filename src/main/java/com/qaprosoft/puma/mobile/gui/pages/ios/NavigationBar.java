package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.puma.mobile.gui.pages.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NavigationBarBase.class)
public class NavigationBar extends NavigationBarBase implements IMobileUtils {
    //xpath from web browser
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == 'Search'`]")
    private ExtendedWebElement searchIcon;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement wishListIcon;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement cartIcon;
    @ExtendedFindBy(iosClassChain = "")
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
