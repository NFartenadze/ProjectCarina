package com.qaprosoft.carina.zoommer.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.zoommer.gui.pages.ComparePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Compare extends AbstractUIObject {

    @FindBy(className = "add-prod-btn")
    private ExtendedWebElement addProductButton;


    @FindBy(className = "comp-product-start")
    private ExtendedWebElement startCompareButton;

    @FindBy(xpath = "/html/body/div[8]/div/div[3]/input")
    private ExtendedWebElement deviceSearchBar;

    //samsung galaxy s22
    @FindBy(css = "div[data-product-id='13838']")
    private ExtendedWebElement searchedSamsung;

    //iphone 14
    @FindBy(css = "div[data-product-id='16142']")
    private ExtendedWebElement searchedIphone;

    public Compare(WebDriver driver) {
        super(driver);
    }

    public boolean isSearchedIphonePresent() {
        return searchedIphone.isElementPresent();
    }

    public boolean isStartCompareButtonPresent() {
        return startCompareButton.isElementPresent();
    }

    public ComparePage clickStartCompareButton() {
        startCompareButton.click();
        return new ComparePage(getDriver());
    }

    public void chooseSearchedIphone() {
        searchedIphone.click();
    }

    public boolean isSearchedSamsungPresent() {
        return searchedSamsung.isElementPresent();
    }

    public boolean isAddProductButtonPresent() {
        return addProductButton.isElementPresent();
    }

    public boolean isDeviceSearchBarPresent() {
        return deviceSearchBar.isElementPresent();
    }

    public void chooseSearchedSamsung() {
        searchedSamsung.click();
    }

    public void deviceSearchBarType(String keys) {
        deviceSearchBar.type(keys);
    }

    public void clickAddProductButton() {
        addProductButton.click();
    }


}
