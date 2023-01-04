package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PumaHomePageBase.class)
public class PumaHomePage extends PumaHomePageBase {
    @FindBy(xpath = "")
    private ExtendedWebElement closeBannerBtn;
    @FindBy(id = "//button[@data-test-id='stay-on-region-button']")
    private ExtendedWebElement stayOnRegionBtn;
    @FindBy(id = "//button[@data-test-id='cookie-banner-close-btn']")
    private ExtendedWebElement cookieBtn;

    public PumaHomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://us.puma.com/us/en");
    }

    @Override
    public void closeBanner() {
        closeBannerBtn.click();
    }

    @Override
    public void stayOnRegion() {
        stayOnRegionBtn.click();
    }

    @Override
    public void acceptCookie() {
        cookieBtn.click();
    }

    @Override
    public void assertElementPresent(ExtendedWebElement extWebElement) {
        super.assertElementPresent(extWebElement);
    }
}
