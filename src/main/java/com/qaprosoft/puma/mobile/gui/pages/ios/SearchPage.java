package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.puma.mobile.gui.pages.common.ResultPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.SearchPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SearchPageBase.class)
public class SearchPage extends SearchPageBase {
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement searchField;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ResultPageBase searchProduct(String s) {
        searchField.type(s);
        searchField.sendKeys(Keys.ENTER);
        return initPage(getDriver(), ResultPageBase.class);
    }

    @Override
    public boolean isSearchFieldPresent() {
        return searchField.isElementPresent();
    }


}
