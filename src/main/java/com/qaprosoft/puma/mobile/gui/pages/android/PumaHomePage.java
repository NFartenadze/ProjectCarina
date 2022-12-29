package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PumaHomePageBase.class)
public class PumaHomePage extends PumaHomePageBase {
    public PumaHomePage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void assertElementPresent(ExtendedWebElement extWebElement) {
        super.assertElementPresent(extWebElement);
    }
}
