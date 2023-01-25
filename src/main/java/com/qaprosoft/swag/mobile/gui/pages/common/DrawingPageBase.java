package com.qaprosoft.swag.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class DrawingPageBase extends AbstractPage implements IMobileUtils {
    public DrawingPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clearDrawing();

    public abstract boolean isClearBtnPresent();

    public abstract void saveDrawing();

    public abstract boolean isSaveBtnPresent();

    public abstract void draw();
}
