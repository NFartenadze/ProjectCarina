package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.ItemPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends ItemPageBase {
    @FindBy(xpath = "//button[@data-test-id='pdp-add-to-cart']")
    private ExtendedWebElement cartButton;

    public ItemPage(WebDriver driver) {
        super(driver);
        setPageURL(driver.getCurrentUrl());
    }

    public boolean isCartButtonPresent() {
        return cartButton.isElementPresent();
    }

    public void addToCart() {
        cartButton.scrollTo();
        cartButton.click();
    }

    @Override
    public boolean isCartBtnPresent() {
        return cartButton.isElementPresent();
    }
}
