package com.qaprosoft.demo.zoommer.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.demo.zoommer.gui.components.Compare;
import com.qaprosoft.demo.zoommer.gui.components.Language;
import com.qaprosoft.demo.zoommer.gui.components.PhoneBrands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends AbstractPage {

    @FindBy(className = "compare-button")
    private ExtendedWebElement compareButton;

    @FindBy(xpath = "/html/body/div[7]/header/div[1]/div/div[2]/div[1]/div")
    private ExtendedWebElement languagesMenuButton;

    @FindBy(css = "a[title='%s']")
    private ExtendedWebElement selectLanguage;



    @FindBy(css = "div[id='eu-cookie-ok']")
    private ExtendedWebElement acceptCookie;
    @FindBy(xpath = "/html/body/div[7]/section/div[2]/div[1]/div[1]/div[2]/ul/li")
    private List<ExtendedWebElement> navigationBar;

    @FindBy(linkText = "%s")
    private ExtendedWebElement brand;




    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://zoommer.ge");
    }

    public boolean isCompareButtonPresent(){
        return compareButton.isElementPresent();
    }
    public Compare clickCompareButton(){
        compareButton.click();
        return new Compare(getDriver());
    }
    public void hoverNavigationBarElement(int index){
        navigationBar.get(index).hover();
    }

    public void clickNavigationBarElement(int index){
        navigationBar.get(index).click();
    }
    public boolean isBrandPresent(PhoneBrands br){
        return brand.format(br.getPhoneBrand()).isElementPresent();
    }
    public PhonesPage chooseBrand(PhoneBrands br){
        brand.format(br.getPhoneBrand()).click();
        return new PhonesPage(getDriver());
    }

//    public boolean[] areNavigationBarElementsPresent(){
//        boolean[] elementsPresent = new boolean[navigationBar.size()];
//        for(int i = 0; i < navigationBar.size(); i++){
//            elementsPresent[i] = navigationBar.get(i).isElementPresent() ? true : false;
//        }
//        return elementsPresent;
//
//    }

    public void selectLanguage(Language lan){
        hoverLanguagesMenubutton();
        selectLanguage.format(lan.getLanguage()).click();
    }
    public boolean isLanguagesMenuButtonPresent(){
        return languagesMenuButton.isElementPresent();
    }

    public void hoverLanguagesMenubutton(){
        languagesMenuButton.hover();
    }


    public boolean isAcceptCookiePresent(){
        return acceptCookie.isElementPresent();
    }
    public void clickAcceptCookie(){
        acceptCookie.click();
    }
}
