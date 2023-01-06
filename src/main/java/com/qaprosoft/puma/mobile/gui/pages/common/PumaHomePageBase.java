package com.qaprosoft.puma.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PumaHomePageBase extends AbstractPage {
    public PumaHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void closeCookiePanel();

    public abstract void stayOnRegion();

    public abstract void closeAppBanner();

    public abstract void closeDiscountBtn();

    //this method will close browser searchbar and won't interrupt MenuPage display
    public abstract void swipeToContainer();
}
