package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.puma.gui.components.NavigationBar;
import com.qaprosoft.puma.mobile.gui.pages.common.PumaHomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PumaHomePageBase {

//    private static final Logger logger = LogManager.getLogger(HomePage.class);

    @FindBy(xpath = "//button[@data-test-id='stay-on-region-button']")
    private ExtendedWebElement stayOnRegion;
    @FindBy(xpath = "//div[@data-test-id='main-nav-bar']")
    private NavigationBar navigationBar;
    @FindBy(css = "#cookie-banner-close-btn")
    private ExtendedWebElement closeCookieButton;

    @FindBy(css = "use[href='/_next/static/assets/icons/close.svg#icon']")
    private ExtendedWebElement discountBtnClose;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://us.puma.com/us/en");
    }


    public void stayOnRegion() {
        stayOnRegion.click();
    }

    public void fullScreen() {
        driver.manage().window().fullscreen();
    }

    public void closeDiscountBtn() {
        discountBtnClose.click();
    }

    public void closeCookiePanel() {
        closeCookieButton.click();
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }


}
