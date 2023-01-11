package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.puma.mobile.gui.pages.common.NavigationBarBase;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PumaHomePageBase.class)
public class PumaHomePage extends PumaHomePageBase implements IMobileUtils {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'Main Navigation, navigation'`]")
    private ExtendedWebElement navigationBar;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement stayOnRegionBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == 'Close'`]")
    private ExtendedWebElement closeCookieButton;

    @ExtendedFindBy(iosClassChain = "")
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
    public void closeDiscountBtn() {
        discountBtnClose.click();
    }

    @Override
    public void closeCookiePanel() {
        closeCookieButton.click();
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
