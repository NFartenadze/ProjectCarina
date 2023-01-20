package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.NavigationBarBase;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PumaHomePageBase.class)
public class PumaHomePage extends PumaHomePageBase implements IMobileUtils {
    @FindBy(xpath = "//nav[@aria-label='Main Navigation']")
    private ExtendedWebElement navigationBar;


    public PumaHomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://us.puma.com/us/en");
    }


    @Override
    public NavigationBarBase getNavigationBar() {
        return initPage(getDriver(), NavigationBarBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return navigationBar.isElementPresent();
    }


}
