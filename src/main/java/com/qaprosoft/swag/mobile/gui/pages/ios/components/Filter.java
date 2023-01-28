package com.qaprosoft.swag.mobile.gui.pages.ios.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.components.FilterBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.Sort;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = FilterBase.class)
public class Filter extends FilterBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"%s\"`]")
    ExtendedWebElement sortOption;


    public Filter(WebDriver driver) {
        super(driver);
    }

    @Override
    public void sortBy(Sort by) {
        sortOption.format(by.getBy()).click();
    }
}
