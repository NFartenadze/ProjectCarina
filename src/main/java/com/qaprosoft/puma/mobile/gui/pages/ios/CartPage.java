package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.puma.mobile.gui.pages.common.CartPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {
    public CartPage(WebDriver driver) {
        super(driver);
    }
}
