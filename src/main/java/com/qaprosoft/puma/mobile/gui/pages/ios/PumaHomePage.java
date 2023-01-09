package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PumaHomePageBase.class)
public class PumaHomePage extends PumaHomePageBase implements IMobileUtils {


    @FindBy(xpath = "//button[@data-test-id='stay-on-region-button']")
    private ExtendedWebElement stayOnRegionBtn;
    @FindBy(id = "cookie-banner-close-btn")
    @Predicate
    private ExtendedWebElement closeCookieButton;

    @FindBy(css = "use[href='/_next/static/assets/icons/close.svg#icon']")
    private ExtendedWebElement discountBtnClose;

    public PumaHomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://us.puma.com/us/en");
    }

    @Override
    public void stayOnRegion() {
        stayOnRegionBtn.click();
    }


    @Override
    public void assertElementPresent(ExtendedWebElement extWebElement) {
        super.assertElementPresent(extWebElement);
    }

    @Override
    public void closeDiscountBtn() {
        discountBtnClose.click();
    }

    @Override
    public void closeCookiePanel() {
        closeCookieButton.click();
    }


}
