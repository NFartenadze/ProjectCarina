package com.qaprosoft.puma.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ClosePopUpUtil extends AbstractUIObject {
    @FindBy(xpath = "//button[@data-test-id='stay-on-region-button']")
    private ExtendedWebElement stayOnRegionBtn;
    @FindBy(css = "#cookie-banner-close-btn")
    private ExtendedWebElement closeCookieButton;

    @FindBy(css = "use[href='/_next/static/assets/icons/close.svg#icon']")
    private ExtendedWebElement discountBtnClose;

    public ClosePopUpUtil(WebDriver driver) {
        super(driver);
    }


    public void stayOnRegion() {
        stayOnRegionBtn.click();
    }

    public void closeDiscountBtn() {
        discountBtnClose.click();
    }

    public void closeCookiePanel() {
        closeCookieButton.click();
    }

}
