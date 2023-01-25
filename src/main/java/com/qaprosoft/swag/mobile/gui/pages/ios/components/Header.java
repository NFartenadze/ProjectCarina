package com.qaprosoft.swag.mobile.gui.pages.ios.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.CartPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.HeaderBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.SideNavigationBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends HeaderBase {
    @FindBy(xpath = "")
    ExtendedWebElement cartIcon;
    @FindBy(xpath = "")
    ExtendedWebElement sideBarBtn;

    public Header(WebDriver driver) {
        super(driver);
    }

    @Override
    public SideNavigationBase openSideBar() {
        return null;
    }

    @Override
    public boolean isSideBarBtnPresent() {
        return false;
    }

    @Override
    public CartPageBase openCartPage() {
        return null;
    }

    @Override
    public boolean isCartIconPresent() {
        return false;
    }
}
