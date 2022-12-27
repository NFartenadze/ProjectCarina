package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.puma.mobile.gui.pages.common.WishListPageBase;
import org.openqa.selenium.WebDriver;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WishListPageBase.class)
public class WishListPage extends WishListPageBase {
    public WishListPage(WebDriver driver) {
        super(driver);
    }
}
