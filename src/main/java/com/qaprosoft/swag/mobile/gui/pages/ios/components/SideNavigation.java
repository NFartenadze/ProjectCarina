package com.qaprosoft.swag.mobile.gui.pages.ios.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.*;
import com.qaprosoft.swag.mobile.gui.pages.common.components.SideNavigationBase;
import org.openqa.selenium.WebDriver;

public class SideNavigation extends SideNavigationBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"ALL ITEMS\"`]")
    ExtendedWebElement productPageLink;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"WEBVIEW\"`]")
    ExtendedWebElement webViewPageLink;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"QR CODE SCANNER\"`]")
    ExtendedWebElement qrCodeScannerPageLink;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"GEO LOCATION\"`]")
    ExtendedWebElement geoLocationPageLink;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"DRAWING\"`]")
    ExtendedWebElement drawingPageLink;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"ABOUT\"`]")
    ExtendedWebElement aboutPageLink;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"LOGOUT\"`]")
    ExtendedWebElement logout;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"RESET APP STATE\"`]")
    ExtendedWebElement resetAppState;

    public SideNavigation(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductsPageBase openProductsPage() {
        productPageLink.click();
        return initPage(getDriver(), ProductsPageBase.class);
    }

    @Override
    public boolean isProductsPageLinkPresent() {
        return productPageLink.isElementPresent();
    }

    @Override
    public WebViewPageBase openWebViewPage() {
        webViewPageLink.click();
        return initPage(getDriver(), WebViewPageBase.class);
    }

    @Override
    public boolean isWebViewPageLinkPresent() {
        return webViewPageLink.isElementPresent();
    }

    @Override
    public QRCodeScannerPageBase openQRScannerPage() {
        qrCodeScannerPageLink.click();
        return initPage(getDriver(), QRCodeScannerPageBase.class);
    }

    @Override
    public boolean isQRScannerPageLinkPresent() {
        return qrCodeScannerPageLink.isElementPresent();
    }

    @Override
    public GeoLocationPageBase openGeoLocationPage() {
        geoLocationPageLink.click();
        return initPage(getDriver(), GeoLocationPageBase.class);
    }

    @Override
    public boolean isGeoLocationPageLinkPresent() {
        return geoLocationPageLink.isElementPresent();
    }

    @Override
    public DrawingPageBase openDrawingPage() {
        drawingPageLink.click();
        return initPage(getDriver(), DrawingPageBase.class);
    }

    @Override
    public boolean isDrawingPageLinkPresent() {
        return drawingPageLink.isElementPresent();
    }

    @Override
    public AboutPageBase openAboutPage() {
        aboutPageLink.click();
        return initPage(getDriver(), AboutPageBase.class);
    }

    @Override
    public boolean isAboutPageLinkPresent() {
        return aboutPageLink.isElementPresent();
    }

    @Override
    public void logOut() {
        logout.click();
    }

    @Override
    public boolean isLogOutBtnPresent() {
        return logout.isElementPresent();
    }

    @Override
    public void resetAppState() {
        resetAppState.click();
    }

    @Override
    public boolean isResetAppStatePresent() {
        return resetAppState.isElementPresent();
    }
}
