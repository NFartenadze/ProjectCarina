package com.qaprosoft.puma.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.puma.gui.pages.ResultPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class NavigationBar extends AbstractUIObject {
    private static final Duration TIMEOUT = Duration.ofSeconds(10);
    @FindBy(xpath = "//div[@data-test-id='main-nav-bar']/ul//span[contains(text(),'Women')]")
    private ExtendedWebElement women;
    @FindBy(xpath = "//div[@data-test-id='main-nav-bar']/ul//span[contains(text(),'Men')]")
    private ExtendedWebElement men;
    @FindBy(xpath = "//div[@data-test-id='main-nav-bar']/ul//span[contains(text(),'Kids')]")
    private ExtendedWebElement kids;
    @FindBy(xpath = "//button[@id = \"account-button\"]")
    private ExtendedWebElement accountButton;
    @FindBy(xpath = "//input['data-test-id=\"search-box\"']")
    private ExtendedWebElement searchBar;
    @FindBy(xpath = "//a[@data-link-name='Shoes']")
    private ExtendedWebElement shoesLink;
    @FindBy(xpath = "//input[@type='search']/../div/button[@type='submit']")
    private ExtendedWebElement searchButton;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public NavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void hoverWomenLink() throws InterruptedException {
        women.hover();
    }

    public boolean isShoesElementPresent() {
        return shoesLink.isElementPresent();
    }

    public void clickShoes() {
        shoesLink.click();
    }

    public boolean isWomenLinkPresent() {
        return women.isElementPresent();
    }

    public void typeInSearchBar(String s) {
        searchBar.type(s);
    }

    public ResultPage clickSearch() {
        searchBar.click();
//        ResultPage resultPage = new ResultPage(getDriver());
//        resultPage.searchBartPageURL(getPageURL() + searchBar.getText());
        return new ResultPage(getDriver());
    }

    public boolean isAccountButtonPresent() {
        return accountButton.isElementPresent();
    }

    public AccountPanel clickAccountButton() {
        accountButton.click();
        return new AccountPanel(getDriver());
    }

    public boolean isSearchBarPresent() {
        return searchBar.isElementPresent();
    }

    public void hoverMenLink() {
        men.hover();
    }


    public boolean isMenLinkPresent() {
        return men.isElementPresent();
    }

    public void hoverKidsLink() {
        kids.hover();
    }

    public boolean isKidsLinkPresent() {
        return kids.isElementPresent();
    }
}
