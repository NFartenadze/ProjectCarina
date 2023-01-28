package com.qaprosoft.swag.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class OverViewPageBase extends AbstractPage {
    public OverViewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void cancelCheckOut();

    public abstract boolean isCancelBtnPresent();

    public abstract void finishCheckout();

    public abstract boolean isFinishBtnPresent();
}
