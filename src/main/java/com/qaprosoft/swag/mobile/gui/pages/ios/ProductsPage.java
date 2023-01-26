package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.ProductsPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.FilterBase;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends ProductsPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Modal Selector Button\"`]/XCUIElementTypeOther/XCUIElementTypeOther")
    ExtendedWebElement filterIcon;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Toggle\"`]")
    ExtendedWebElement productViewBtn;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void changeProductView() {
        productViewBtn.click();
    }

    @Override
    public boolean isProductViewBtnPresent() {
        return productViewBtn.isElementPresent();
    }

    @Override
    public FilterBase openFilter() {
        filterIcon.click();
        return initPage(getDriver(), FilterBase.class);
    }

    @Override
    public boolean isFilterIconPresent() {
        return filterIcon.isElementPresent();
    }
}
