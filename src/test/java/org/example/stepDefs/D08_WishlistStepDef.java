package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;


import java.awt.*;
import java.time.Duration;
import java.util.List;

public class D08_WishlistStepDef {
    P02_homePage homepage2=new P02_homePage();
    SoftAssert softAssert=new SoftAssert();

    @When("user click on wish mark")
        public void click_add_to_wishes(){
        List<WebElement>wishList=homepage2.addproducttoWih();
        System.out.println(wishList.size());
        wishList.get(2).click();

    }
    @Then("get green message")
    public void verify_green_message()
    {
        softAssert.assertTrue(homepage2.sSelectsuccessmessage().isDisplayed());
        String actBackcolor=homepage2.sSelectMeColor().getCssValue("background-color");
       String bColor= Color.fromString(actBackcolor).asHex();

        System.out.println(actBackcolor);
        System.out.println(bColor);
        String actualcolor="#4bb07a";
        softAssert.assertTrue(actualcolor.contains(bColor));
        softAssert.assertAll();
    }

    @When("user click on wish list page")
    public void userClickOnWishListPage() {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        homepage2.sWishpage().click();

    }

    @Then("wish list count more than1")
    public void wishListCount() {
        String wishValue = homepage2.sWiscount().getAttribute("value");
        int wishcount= Integer.parseInt(wishValue);
        System.out.println(wishcount);
        softAssert.assertTrue(wishcount>0);
        softAssert.assertAll();



    }
}
