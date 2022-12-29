package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PumaHomePageBase.class)
public class PumaPumaHomePage extends PumaHomePageBase {
    public PumaPumaHomePage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void assertElementPresent(ExtendedWebElement extWebElement) {
        super.assertElementPresent(extWebElement);
    }
}
