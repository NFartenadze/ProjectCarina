package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.ResultPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.ItemPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ResultPageBase.class)
public class ResultPage extends ResultPageBase {
    private static final Logger logger = LogManager.getLogger(ResultPage.class);

    @FindBy(xpath = "//ul[@id='product-list-items']/li/div[3]/a/h3")
    private List<ExtendedWebElement> itemTitles;
    @FindBy(xpath = "//ul[@id='product-list-items']")
    private ExtendedWebElement itemContainer;
    @FindBy(xpath = "//li[@data-test-id='product-list-item']")
    private List<ExtendedWebElement> items;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void printResultItemTexts() {
        itemTitles
                .forEach(e -> logger.info(e.getText()));
    }

    @Override
    public boolean isPageOpened() {
        return itemContainer.isElementPresent();
    }


    @Override
    public ItemPageBase selectSearchedItem(int i) {
        items.get(i).click();
        return initPage(getDriver(), ItemPageBase.class);
    }

}
