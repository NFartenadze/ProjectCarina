package com.qaprosoft.swag.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WebViewPageBase extends AbstractPage {
    public WebViewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void enterUrl(String url);

    public abstract boolean isUrlFieldPresent();

    public abstract void goToSite();

    public abstract boolean isGoToSiteBtnPresent();
}
