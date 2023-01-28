package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.swag.mobile.gui.pages.common.GeoLocationPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GeoLocationPageBase.class)
public class GeoLocationPage extends GeoLocationPageBase {
    public GeoLocationPage(WebDriver driver) {
        super(driver);
    }
}
