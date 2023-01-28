package com.qaprosoft.swag.mobile.gui.pages.ios;

import com.qaprosoft.swag.mobile.gui.pages.common.QRCodeScannerPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = QRCodeScannerPageBase.class)
public class QRCodeScannerPage extends QRCodeScannerPageBase {
    public QRCodeScannerPage(WebDriver driver) {
        super(driver);
    }
}
