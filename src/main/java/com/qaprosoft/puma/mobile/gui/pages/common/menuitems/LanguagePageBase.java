package com.qaprosoft.puma.mobile.gui.pages.common.menuitems;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.puma.mobile.gui.pages.android.Countries;
import org.openqa.selenium.WebDriver;

public abstract class LanguagePageBase extends AbstractPage {
    public LanguagePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void closeLanguagePage();

    public abstract void searchLanguage(Countries state);

    public abstract void selectLanguage();
}
