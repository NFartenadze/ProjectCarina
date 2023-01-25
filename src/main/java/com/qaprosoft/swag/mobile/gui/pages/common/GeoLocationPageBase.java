package com.qaprosoft.swag.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class GeoLocationPageBase extends AbstractPage implements IMobileUtils {
    public GeoLocationPageBase(WebDriver driver) {
        super(driver);
    }
}
