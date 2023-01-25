package com.qaprosoft.swag.mobile.gui.pages.common.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class FilterBase extends AbstractPage {
    public FilterBase(WebDriver driver) {
        super(driver);
    }

    public abstract void sortBy(Sort by);

}
