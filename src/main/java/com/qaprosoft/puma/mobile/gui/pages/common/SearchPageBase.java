package com.qaprosoft.puma.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.ItemPageBase;
import org.openqa.selenium.WebDriver;

public abstract class SearchPageBase extends AbstractPage {
    public SearchPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ResultPageBase searchProduct(String s);
    public abstract boolean isSearchFieldPresent();


}
