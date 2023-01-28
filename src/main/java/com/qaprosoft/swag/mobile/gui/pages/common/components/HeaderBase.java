package com.qaprosoft.swag.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.swag.mobile.gui.pages.common.CartPageBase;
import org.openqa.selenium.WebDriver;

public abstract class HeaderBase extends AbstractPage {


    public HeaderBase(WebDriver driver) {
        super(driver);
    }

    public abstract SideNavigationBase openSideBar();

    public abstract boolean isSideBarBtnPresent();

    public abstract CartPageBase openCartPage();

    public abstract boolean isCartIconPresent();
}
