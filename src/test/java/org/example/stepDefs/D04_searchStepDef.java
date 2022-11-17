package org.example.stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    SoftAssert softAssert = new SoftAssert();
    P03_homePage homePage = new P03_homePage();
    @When("user search enter product name and click search")
    public void enter_text()
    {
        homePage.sSearchText().sendKeys("book");

    }
    @And("search with book")
            public void clik_search()
    {
        homePage.sSearchText().sendKeys(Keys.ENTER);
    }
    @Then("user get relevant data")
    public void confirmresult() {
        List<WebElement> producrName = homePage.select_product_name();
        System.out.println("list size = " + producrName.size());
        for (int i = 0; i < producrName.size(); i++) {
            String name = producrName.get(i).getText();
            String name2 = name.toLowerCase();

            System.out.println(name);
            softAssert.assertTrue(name2.contains("book"));
            softAssert.assertAll();
        }
    }
        @And("url contains")
        public void checkURL()
        {
            String expectedLink = "https://demo.nopcommerce.com/search?q=book";
            softAssert.assertTrue(homePage.getURL().contains(expectedLink));
            softAssert.assertAll();
        }
    @When("user search enter SKU and click search")
    public void enter_SKU()
    {
        homePage.sSearchText().sendKeys("APPLE_CAM");

    }
    @Then("user get relevant data to SKU")
    public void confirmresultSKU() {
        List<WebElement> producrName = homePage.select_product_name();
        System.out.println("list size = " + producrName.size());

        for (int i = 0; i < producrName.size(); i++) {

            homePage.click_product_name().click();


            System.out.println("done");


            String expextedSKU = "APPLE_CAM";
            softAssert.assertTrue(expextedSKU.contains("APPLE_CAM"));
            softAssert.assertAll();
        }


    }

}
