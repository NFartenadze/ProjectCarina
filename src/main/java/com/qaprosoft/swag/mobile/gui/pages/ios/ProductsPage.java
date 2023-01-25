package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.swag.mobile.gui.pages.common.ProductsPageBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.FilterBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends ProductsPageBase {
    @FindBy(xpath = "")
    ExtendedWebElement filterIcon;
    @FindBy(xpath = "")
    ExtendedWebElement productViewBtn;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void changeProductView() {

    }

    @Override
    public boolean isProductViewBtnPresent() {
        return false;
    }

    @Override
    public FilterBase openFilter() {
        return null;
    }

    @Override
    public boolean isFilterIconPresent() {
        return false;
    }
}
