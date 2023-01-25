package com.qaprosoft.swag.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.swag.mobile.gui.pages.common.*;
import org.openqa.selenium.WebDriver;

public abstract class SideNavigationBase extends AbstractPage {
    public SideNavigationBase(WebDriver driver) {
        super(driver);
    }

    public abstract ProductsPageBase openProductsPage();

    public abstract boolean isProductsPageLinkPresent();

    public abstract WebViewPageBase openWebViewPage();

    public abstract boolean isWebViewPageLinkPresent();

    public abstract QRCodeScannerPageBase openQRScannerPage();

    public abstract boolean isQRScannerPageLinkPresent();

    public abstract GeoLocationPageBase openGeoLocationPage();

    public abstract boolean isGeoLocationPageLinkPresent();

    public abstract DrawingPageBase openDrawingPage();

    public abstract boolean isDrawingPageLinkPresent();

    public abstract AboutPageBase openAboutPage();

    public abstract boolean isAboutPageLinkPresent();

    public abstract void logOut();

    public abstract boolean isLogOutBtnPresent();

    public abstract void resetAppState();

    public abstract boolean isResetAppStatePresent();

}
