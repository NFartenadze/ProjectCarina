package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.ChromeHomePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ChromeHomePageBase.class)
public class ChromeHomePage extends ChromeHomePageBase {
    @FindBy(xpath = "com.android.chrome:id/search_box_text")
    ExtendedWebElement searchBar;

    public ChromeHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo(String url) {
        searchBar.type(url);
        searchBar.sendKeys(Keys.ENTER);
    }

    @Override
    public boolean isSearchBarPresent() {
        return searchBar.isElementPresent();
    }

    @Override
    public PumaHomePageBase openPuma() {
        return null;
    }
}
