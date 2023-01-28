package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.OverViewPageBase;
import org.openqa.selenium.WebDriver;

public class OverViewPage extends OverViewPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"CANCEL\"`][2]")
    ExtendedWebElement cancelBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"FINISH\"`][2]")
    ExtendedWebElement finishBtn;

    public OverViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void cancelCheckOut() {
        cancelBtn.click();
    }

    @Override
    public boolean isCancelBtnPresent() {
        return cancelBtn.isElementPresent();
    }

    @Override
    public void finishCheckout() {
        finishBtn.click();
    }

    @Override
    public boolean isFinishBtnPresent() {
        return finishBtn.isElementPresent();
    }
}
