package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.WebViewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-enter a https url here...\"`]")
    ExtendedWebElement urlField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"GO TO SITE\"`][3]")
    ExtendedWebElement goToSiteBtn;

    public WebViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterUrl(String url) {
        urlField.type(url);
    }

    @Override
    public boolean isUrlFieldPresent() {
        return urlField.isElementPresent();
    }

    @Override
    public void goToSite() {
        goToSiteBtn.click();
    }

    @Override
    public boolean isGoToSiteBtnPresent() {
        return goToSiteBtn.isElementPresent();
    }


}
