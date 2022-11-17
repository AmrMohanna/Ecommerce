package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lv.Tad;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
P03_homePage homePage=new P03_homePage();


    @When("user chose euro currency")
    public void choes_euro(){
        Select select=new Select(homePage.sCurrency());
        select.selectByVisibleText("Euro");

    }
    @Then("all product currency change to Euro")
    public void check_currency(){
        List<WebElement> product_price=homePage.select_product();
        for (int i =0 ;i<product_price.size();i++){
           String price= product_price.get(i).getText();
            System.out.println(price);
            Assert.assertTrue(price.contains("€"));
        }



    }
}
