package com.qaprosoft.swag.mobile.gui.pages.ios.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.puma.mobile.gui.pages.common.CartPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.HeaderBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.SideNavigationBase;
import org.openqa.selenium.WebDriver;

public class Header extends HeaderBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]/XCUIElementTypeOther")
    ExtendedWebElement cartIcon;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Menu\"`]")
    ExtendedWebElement sideBarBtn;

    public Header(WebDriver driver) {
        super(driver);
    }

    @Override
    public SideNavigationBase openSideBar() {
        sideBarBtn.click();
        return initPage(getDriver(), SideNavigationBase.class);
    }

    @Override
    public boolean isSideBarBtnPresent() {
        return sideBarBtn.isElementPresent();
    }

    @Override
    public CartPageBase openCartPage() {
        cartIcon.click();
        return initPage(getDriver(), CartPageBase.class);
    }

    @Override
    public boolean isCartIconPresent() {
        return cartIcon.isElementPresent();
    }
}
