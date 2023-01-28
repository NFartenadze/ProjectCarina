package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.CartPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.CheckOutPageBase;
import org.openqa.selenium.WebDriver;

public class CartPage extends CartPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"CONTINUE SHOPPING\"`][2]")
    ExtendedWebElement continueShoppingBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"CHECKOUT\"`][2]")
    ExtendedWebElement checkOutBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void goBackToProductsPage() {
        continueShoppingBtn.click();
    }

    @Override
    public CheckOutPageBase checkOut() {

        return initPage(getDriver(), CheckOutPageBase.class);
    }

    @Override
    public boolean isCheckOutBtnPresent() {
        return checkOutBtn.isElementPresent();
    }
}
