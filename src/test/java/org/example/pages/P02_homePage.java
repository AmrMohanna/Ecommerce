package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P02_homePage {
    public List sHoverMainCategory()
    {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href] "));
    }

    public WebElement getProductTitie()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public List addproducttoWih()
    {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement sWishpage()
    {
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public WebElement sWiscount()
    {
        return Hooks.driver.findElement(By.className("qty-input"));
    }
    public WebElement sSelectsuccessmessage()
    {
        return Hooks.driver.findElement(By.className("content"));
    }
    public WebElement sSelectMeColor()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }



}
