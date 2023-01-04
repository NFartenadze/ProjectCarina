package com.qaprosoft.puma.mobile.gui.pages.android.menuitems;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.mobile.gui.pages.common.menuitems.SupportPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SupportPageBase.class)
public class SupportPage extends SupportPageBase {
    @FindBy(css = "a[href='mailto:customerservice.us@puma.com']")
    private ExtendedWebElement email;
    @FindBy(css = "a[href=\"tel:1-888-565-7862\"]")
    private ExtendedWebElement number;

    public SupportPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getEmail() {
        return email.getText();
    }

    @Override
    public boolean isEmailPresent() {
        return email.isElementPresent();
    }

    @Override
    public String getNumber() {
        return number.getText();
    }

    @Override
    public boolean isNumberPresent() {
        return number.isElementPresent();
    }
}
