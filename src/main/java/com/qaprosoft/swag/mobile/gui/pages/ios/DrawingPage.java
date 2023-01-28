package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.swag.mobile.gui.pages.common.DrawingPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DrawingPageBase.class)
public class DrawingPage extends DrawingPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"SAVE\"`][2]")
    ExtendedWebElement saveBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"CLEAR\"`][2]")
    ExtendedWebElement clearBtn;

    public DrawingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clearDrawing() {
        clearBtn.click();
    }

    @Override
    public boolean isClearBtnPresent() {
        return clearBtn.isElementPresent();
    }

    @Override
    public void saveDrawing() {
        saveBtn.click();
    }

    @Override
    public boolean isSaveBtnPresent() {
        return saveBtn.isElementPresent();
    }

    @Override
    public void draw() {

    }
}
