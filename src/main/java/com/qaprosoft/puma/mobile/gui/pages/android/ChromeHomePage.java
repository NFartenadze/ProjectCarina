package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.ChromeHomePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ChromeHomePageBase.class)
public class ChromeHomePage extends ChromeHomePageBase {
    @FindBy(id = "com.android.chrome:id/search_box_text")
    ExtendedWebElement searchBar;

    @FindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout")
    ExtendedWebElement resultLink;

    public ChromeHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void navigateTo(String url) {
        searchBar.type(url);
        resultLink.click();
    }


    @Override
    public boolean isSearchBarPresent() {
        return searchBar.isElementPresent();
    }

    @Override
    public PumaHomePageBase openPuma() {
        searchBar.type(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
        resultLink.click();
        return initPage(getDriver(), PumaHomePageBase.class);
    }

}
