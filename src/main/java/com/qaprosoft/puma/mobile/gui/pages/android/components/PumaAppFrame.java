package com.qaprosoft.puma.mobile.gui.pages.android.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PumaAppFrame extends AbstractPage {
    @FindBy(id = "branch-banner-iframe")
    private ExtendedWebElement iframe;
    @FindBy(id = "branch-banner-close1")
    private ExtendedWebElement closeBannerBtn;

    public PumaAppFrame(WebDriver driver) {
        super(driver);
    }

    public void closeAppBanner() {
        PumaAppFrame frame = new PumaAppFrame(getDriver());
        driver.switchTo().frame(iframe.getElement());
        closeBannerBtn.click();
        getDriver().switchTo().defaultContent();
    }

}
