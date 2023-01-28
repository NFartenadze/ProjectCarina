package com.qaprosoft.swag.mobile.gui.pages.common;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.swag.mobile.gui.pages.common.components.FilterBase;
import org.openqa.selenium.WebDriver;

public abstract class ProductsPageBase extends AbstractPage {
    public ProductsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void changeProductView();

    public abstract boolean isProductViewBtnPresent();

    public abstract FilterBase openFilter();

    public abstract boolean isFilterIconPresent();

    public abstract void addProductToCart(int index);

    public abstract ExtendedWebElement getProduct(int i);
}
