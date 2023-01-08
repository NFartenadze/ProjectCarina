package com.qaprosoft.puma.mobile.gui.pages.android.menuitems;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.android.Countries;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.LanguagePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LanguagePageBase.class)
public class LanguagePage extends LanguagePageBase {

    @FindBy(id = "location-selector-input")
    private ExtendedWebElement searchField;
    @FindBy(xpath = "//button[@data-test-id='location-selector-close']")
    private ExtendedWebElement closeBtn;
    @FindBy(xpath = "//ul[@id='location-results-listbox']/li")
    private ExtendedWebElement searchedLanguage;


    public LanguagePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void closeLanguagePage() {
        closeBtn.click();
    }

    @Override
    public void searchLanguage(Countries country) {
        searchField.click();
        searchField.type(country.getCountry());
    }

    @Override
    public void selectLanguage() {
        searchedLanguage.click();
    }
}
