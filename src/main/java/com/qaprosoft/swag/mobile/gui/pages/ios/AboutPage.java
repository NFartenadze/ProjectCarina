package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.swag.mobile.gui.pages.common.AboutPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AboutPageBase.class)
public class AboutPage extends AboutPageBase {
    public AboutPage(WebDriver driver) {
        super(driver);
    }
}
