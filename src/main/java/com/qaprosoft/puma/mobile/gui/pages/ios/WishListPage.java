package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.puma.mobile.gui.pages.common.WishListPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WishListPageBase.class)
public class WishListPage extends WishListPageBase {
    public WishListPage(WebDriver driver) {
        super(driver);
    }
}
