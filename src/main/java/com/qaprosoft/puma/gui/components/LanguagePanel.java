package com.qaprosoft.puma.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LanguagePanel extends AbstractPage {
    private static final Logger logger = LogManager.getLogger(LanguagePanel.class);

    @FindBy(xpath = "//input[@id='location-selector-input']")
    private ExtendedWebElement searchField;
    @FindBy(xpath = "//ul[@id='location-results-listbox']//a")
    private ExtendedWebElement searchedLanguage;

    @FindBy(xpath = "//*[@id='location-selector-input']/../div[contains(@class,'absolute')]")
    private ExtendedWebElement searchButton;


    public LanguagePanel(WebDriver driver) {
        super(driver);
    }

    public void clickSearchedLanguage() {
        searchedLanguage.click();
    }

    public boolean checkResult() {
        return searchedLanguage.isElementPresent();
    }

    public boolean isSearchFieldPresent() {
        return searchField.isElementPresent();
    }

    public void typeInSearch(String s) {
        searchField.type(s);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public boolean isSearchButtonPresent() {
        return searchButton.isElementPresent();
    }


}
