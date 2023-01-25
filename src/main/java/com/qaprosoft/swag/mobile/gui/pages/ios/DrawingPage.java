package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.swag.mobile.gui.pages.common.DrawingPageBase;
import org.openqa.selenium.WebDriver;

public class DrawingPage extends DrawingPageBase {
    public DrawingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clearDrawing() {

    }

    @Override
    public boolean isClearBtnPresent() {
        return false;
    }

    @Override
    public void saveDrawing() {

    }

    @Override
    public boolean isSaveBtnPresent() {
        return false;
    }

    @Override
    public void draw() {

    }
}
