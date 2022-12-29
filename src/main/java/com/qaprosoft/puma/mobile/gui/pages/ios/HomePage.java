package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.ChromeHomePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Chrome\"]")
    private ExtendedWebElement chromeIcon;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ChromeHomePageBase openChrome() {
        chromeIcon.click();
        return initPage(getDriver(), ChromeHomePage.class);
    }

    @Override
    public boolean isChromePresent() {
        return chromeIcon.isElementPresent();
    }
}
