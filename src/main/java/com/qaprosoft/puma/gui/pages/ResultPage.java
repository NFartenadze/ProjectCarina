package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends AbstractPage {

    private static final Logger logger = LogManager.getLogger(ResultPage.class);

    @FindBy(xpath = "//ul[@id='product-list-items']/li/div[3]/a/h3")
    private List<ExtendedWebElement> itemTitles;

    @FindBy(css = "#cookie-banner-close-btn")
    private ExtendedWebElement closeCookieButton;

    @FindBy(xpath = "//li[@data-test-id='product-list-item']")
    private List<ExtendedWebElement> items;

    public ResultPage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public void closeCookiePanel() {
        closeCookieButton.click();
    }

    public void clickItem(int i) {
        items.get(i).scrollTo();
        items.get(i).click();
    }

    public void printResultItemTexts() {
        itemTitles
                .forEach(e -> logger.info(e.getText()));
    }


    public int getAmountOfItems() {
        return itemTitles.size();
    }


}