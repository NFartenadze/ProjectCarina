package com.qaprosoft.puma.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.puma.mobile.gui.pages.common.ResultPageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.ItemPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ResultPageBase.class)
public class ResultPage extends ResultPageBase {
    private static final Logger logger = LogManager.getLogger(ResultPage.class);

    @ExtendedFindBy(iosClassChain = "")
    private List<ExtendedWebElement> itemTitles;
    @ExtendedFindBy(iosClassChain = "")
    private ExtendedWebElement itemContainer;
    @ExtendedFindBy(iosClassChain = "")
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
