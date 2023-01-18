package com.qaprosoft.puma.mobile.gui.pages.common.menuitems;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ItemPageBase extends AbstractPage {
    public ItemPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void addToCart();

    public abstract boolean isCartBtnPresent();
}
