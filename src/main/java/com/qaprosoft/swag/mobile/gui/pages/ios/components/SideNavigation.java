package com.qaprosoft.swag.mobile.gui.pages.ios.components;

import com.qaprosoft.swag.mobile.gui.pages.common.*;
import com.qaprosoft.swag.mobile.gui.pages.common.components.SideNavigationBase;
import org.openqa.selenium.WebDriver;

public class SideNavigation extends SideNavigationBase {
    public SideNavigation(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductsPageBase openProductsPage() {
        return null;
    }

    @Override
    public boolean isProductsPageLinkPresent() {
        return false;
    }

    @Override
    public WebViewPageBase openWebViewPage() {
        return null;
    }

    @Override
    public boolean isWebViewPageLinkPresent() {
        return false;
    }

    @Override
    public QRCodeScannerPageBase openQRScannerPage() {
        return null;
    }

    @Override
    public boolean isQRScannerPageLinkPresent() {
        return false;
    }

    @Override
    public GeoLocationPageBase openGeoLocationPage() {
        return null;
    }

    @Override
    public boolean isGeoLocationPageLinkPresent() {
        return false;
    }

    @Override
    public DrawingPageBase openDrawingPage() {
        return null;
    }

    @Override
    public boolean isDrawingPageLinkPresent() {
        return false;
    }

    @Override
    public AboutPageBase openAboutPage() {
        return null;
    }

    @Override
    public boolean isAboutPageLinkPresent() {
        return false;
    }

    @Override
    public void logOut() {

    }

    @Override
    public boolean isLogOutBtnPresent() {
        return false;
    }

    @Override
    public void resetAppState() {

    }

    @Override
    public boolean isResetAppStatePresent() {
        return false;
    }
}
