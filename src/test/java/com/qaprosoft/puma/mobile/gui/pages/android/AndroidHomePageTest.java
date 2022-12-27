package com.qaprosoft.puma.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.puma.mobile.gui.pages.common.AndroidHomePageBase;
import com.qaprosoft.puma.mobile.gui.pages.common.ChromeHomePageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndroidHomePageTest implements IAbstractTest, IMobileUtils {

    @Test()
    public void searchItem() {
        AndroidHomePageBase androidHomePage = new AndroidHomePage(getDriver());
        Assert.assertTrue(androidHomePage.isChromePresent(), "chrome isn't present");
        ChromeHomePageBase chromeHomePage = androidHomePage.openChrome();
    }

}