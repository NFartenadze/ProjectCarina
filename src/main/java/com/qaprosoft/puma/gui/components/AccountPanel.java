package com.qaprosoft.puma.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.puma.gui.pages.LoginPage;
import com.qaprosoft.puma.gui.pages.RegistrationPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPanel extends AbstractUIObject {
    private static final Logger logger = LogManager.getLogger(AccountPanel.class);

    @FindBy(xpath = "//a[@class='tw-ceac4s tw-xbcb1y']")
    private List<ExtendedWebElement> accountMenuItems;

    @FindBy(xpath = "//span[contains(text(),'Language')]")
    private ExtendedWebElement language;
    @FindBy(xpath = "//a[@data-test-id='login-button']")
    private ExtendedWebElement loginButton;
    @FindBy(xpath = "//a[contains(text(),'Register here')]")
    private ExtendedWebElement registerButton;

    public AccountPanel(WebDriver driver) {
        super(driver);
    }

    public AccountPanel(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isLanguagePresent() {
        return language.isElementPresent();
    }

    public LanguagePanel clickLanguage() {
//        new WebDriverWait(WebDriverPool.get(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(language));
        language.click();
        logger.info("language button clicked");
        return new LanguagePanel(getDriver());
    }

    public boolean isLoginButtonPresent() {
        return loginButton.isElementPresent();
    }

    public boolean isRegisterButtonPresent() {
        return registerButton.isElementPresent();
    }

    public boolean isMenuItemPresent(MenuItems i) {
        return accountMenuItems.get(i.getItemIndex()).isElementPresent();
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage(getDriver());
    }

    public RegistrationPage clickRegisterButton() {
        registerButton.click();
        return new RegistrationPage(getDriver());
    }

    public void clickMenuItem(MenuItems i) {
        accountMenuItems.get(i.getItemIndex()).click();
    }

    public enum MenuItems {
        MY_ACCOUNT(0),
        INITIATE_RETURN(1),
        SUPPORT(2),
        WISHLIST(3);

        private int itemIndex;

        MenuItems(int itemIndex) {
            this.itemIndex = itemIndex;
        }

        public int getItemIndex() {
            return itemIndex;
        }
    }
}
