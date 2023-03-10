package com.qaprosoft.puma.mobile.gui.pages.android.menuitems;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.ItemPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ItemPageBase.class)
public class ItemPage extends ItemPageBase {
    @FindBy(xpath = "//button[@data-test-id='pdp-add-to-cart']")
    private ExtendedWebElement cartButton;

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartBtnPresent() {
        return cartButton.isElementPresent();
    }

    public void addToCart() {
        cartButton.scrollTo();
        cartButton.click();
    }
}
