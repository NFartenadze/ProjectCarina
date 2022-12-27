package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.AndroidHomePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.ChromeHomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AndroidHomePageBase.class)
public class AndroidHomePage extends AndroidHomePageBase {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Chrome\"]")
    private ExtendedWebElement chromeIcon;
    public AndroidHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ChromeHomePageBase openChrome() {
        chromeIcon.click();
        return initPage(getDriver(),ChromeHomePage.class);
    }

    @Override
    public boolean isChromePresent() {
        return chromeIcon.isElementPresent();
    }
}
