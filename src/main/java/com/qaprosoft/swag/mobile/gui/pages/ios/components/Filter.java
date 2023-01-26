package com.qaprosoft.swag.mobile.gui.pages.ios.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.swag.mobile.gui.pages.common.components.FilterBase;
import com.qaprosoft.swag.mobile.gui.pages.common.components.Sort;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Filter extends FilterBase {

    @FindBy(xpath = "**/XCUIElementTypeOther[`label == '%s'`]")
    ExtendedWebElement sortOption;


    public Filter(WebDriver driver) {
        super(driver);
    }

    @Override
    public void sortBy(Sort by) {
        sortOption.format(by.getBy()).click();
    }
}
