package com.qaprosoft.swag.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractPage {

    public CartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void goBackToProductsPage();

    public abstract CheckOutPageBase checkOut();

    public abstract boolean isCheckOutBtnPresent();
}
