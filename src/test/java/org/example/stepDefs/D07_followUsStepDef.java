package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D07_followUsStepDef
{
    SoftAssert softAssert=new SoftAssert();
    P03_homePage homePage=new P03_homePage();
    @When("user click on Fb icon")
    public void clickfb() {
        homePage.sFaceBook().click();


    }
    @Then("open FB site")
    public void checkFB() throws InterruptedException {
        String expectedUrl=homePage.newwindwowURl().toLowerCase().trim();
        System.out.println(expectedUrl);
        String actualUrl="https://www.facebook.com/nopCommerce".toLowerCase().trim();
        softAssert.assertTrue(actualUrl.contains(expectedUrl));
        softAssert.assertAll();

    }
    @When("user click on Twitter icon")
    public void clickTwitter() {
        homePage.sTwitter().click();


    }
    @Then("open Twitter site")
    public void checkTwitter() throws InterruptedException {
        String expectedUrl=homePage.newwindwowURl().toLowerCase().trim();
        System.out.println(expectedUrl);
        String actualUrl="https://twitter.com/nopCommerce".toLowerCase().trim();
        softAssert.assertTrue(actualUrl.contains(expectedUrl));
        softAssert.assertAll();

    }

    @When("user click on Rss icon")
    public void clickRss() {
        homePage.sRss().click();


    }
    @Then("open Rss site")
    public void checkRss() throws InterruptedException {
       // String expectedUrl=homePage.newwindwowURl().toLowerCase().trim();
        String expectedUrl =Hooks.driver.getCurrentUrl();
        System.out.println(expectedUrl);
        String actualUrl="https://demo.nopcommerce.com/new-online-store-is-open".toLowerCase().trim();
        softAssert.assertTrue(actualUrl.contains(expectedUrl));
        softAssert.assertAll();

    }
    @When("user click on Youtube icon")
    public void clickYoutube() {
        homePage.sYoutube().click();


    }
    @Then("open Youtube site")
    public void checkYoutube() throws InterruptedException {
        String expectedUrl=homePage.newwindwowURl().toLowerCase().trim();
        System.out.println(expectedUrl);
        String actualUrl="https://www.youtube.com/user/nopCommerce".toLowerCase().trim();
        softAssert.assertTrue(actualUrl.contains(expectedUrl));
        softAssert.assertAll();

    }
}
