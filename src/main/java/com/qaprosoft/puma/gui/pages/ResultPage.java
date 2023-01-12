package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.ItemPageBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends AbstractPage {

    private static final Logger logger = LogManager.getLogger(ResultPage.class);

    @FindBy(xpath = "//a[@data-test-id='product-list-item-link']//h3")
    private List<ExtendedWebElement> itemTitles;
    @FindBy(xpath = "//ul[@id='product-list-items']")
    private ExtendedWebElement itemContainer;

    @FindBy(xpath = "//li[@data-test-id='product-list-item']")
    private List<ExtendedWebElement> items;

    public ResultPage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }


    public ItemPageBase selectSearchedItem(int i) {
        items.get(i).scrollTo();
        items.get(i).click();
        return initPage(getDriver(), ItemPageBase.class);
    }

    public void printResultItemTexts() {
        itemTitles.forEach(e -> logger.info(e.getText()));
    }

    public boolean isPageOpened() {
        return itemContainer.isElementPresent();
    }


    public int getAmountOfItems() {
        return itemTitles.size();
    }


}