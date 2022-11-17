package org.example.pages;

import org.example.stepDefs.D05_hoverCategoriesStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class P03_homePage {
    RegisterPage registerPage = new RegisterPage();
    SoftAssert softAssert = new SoftAssert();
    D05_hoverCategoriesStepDef  hoverCategoriesStepDef =new D05_hoverCategoriesStepDef();


    public WebElement sCurrency() {
        return Hooks.driver.findElement(By.id("customerCurrency"));

    }

    public List select_product() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement sSearchText() {
        return Hooks.driver.findElement(By.id("small-searchterms"));

    }

    public List select_product_name() {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public String getURL(){
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement click_product_name() {
        return Hooks.driver.findElement(By.cssSelector("a[title=\"Show details for Apple iCam\"]"));
    }
             //ul[class="top-menu notmobile"]>li>a[href]


    public WebElement sSubCatName() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));

    }
    //ul[class="top-menu notmobile"]>li>a[href]   Css selector of hover
    //By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+randome+"]/ul[@class=\"sublist first-level\"]/li"));
    // //ul[@class="top-menu notmobile"]/li[1]/ul[@class="sublist first-level"]/li      sub
    public List <WebElement> selectSlider(){
        return Hooks.driver.findElements(By.id("nivo-slider"));

    }
    //comunication pages
    public WebElement sFaceBook() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));

    }
    public WebElement sTwitter() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));

    }
    public WebElement sRss() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));

    }
    public WebElement sYoutube() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));

    }
    public String newwindwowURl() throws InterruptedException {
        ArrayList<String> taps=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(taps.get(1));
        Thread.sleep(2000);
        String Tapurl=Hooks.driver.getCurrentUrl();
        return Tapurl;
    }





}
