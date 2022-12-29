package com.qaprosoft.puma.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.puma.gui.components.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

//    private static final Logger logger = LogManager.getLogger(HomePage.class);

    @FindBy(xpath = "//button[@data-test-id='location-check-stay-on-country']")
    private ExtendedWebElement stayOnRegion;
    @FindBy(xpath = "//div[@data-test-id='main-nav-bar']")
    private NavigationBar navigationBar;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://us.puma.com/us/en");
    }


    public void clickStayOnRegion() {
        stayOnRegion.click();
    }


    public NavigationBar getNavigationBar() {
        return navigationBar;
    }


}
