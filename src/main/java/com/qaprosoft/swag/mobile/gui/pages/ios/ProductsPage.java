package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.ProductsPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.FilterBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductsPageBase.class)
public class ProductsPage extends ProductsPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Modal Selector Button\"`]/XCUIElementTypeOther/XCUIElementTypeOther")
    ExtendedWebElement filterIcon;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Toggle\"`]")
    ExtendedWebElement productViewBtn;
 
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"ADD TO CART\"`][%s]")
    ExtendedWebElement addToCartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Item\"`]")
    List<ExtendedWebElement> products;


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

    @Override
    public void addProductToCart(int index) {
        addToCartBtn.format(index).click();
    }

    @Override
    public ExtendedWebElement getProduct(int i) {
        return products.get(i);
    }
}
