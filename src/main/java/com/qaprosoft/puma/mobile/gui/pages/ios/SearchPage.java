package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.ResultPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.SearchPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SearchPageBase.class)
public class SearchPage extends SearchPageBase {
    @FindBy(xpath = "//android.view.View/android.view.View/android.widget.EditText")
    private ExtendedWebElement searchField;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ResultPageBase searchProduct(String s) {
        searchField.type(s);
        return initPage(getDriver(), ResultPageBase.class);
    }

    @Override
    public boolean isSearchFieldPresent() {
        return searchField.isElementPresent();
    }


}
