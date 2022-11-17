package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    SoftAssert softAssert=new SoftAssert();
    P02_homePage homePage2=new P02_homePage();
    int randoemN= new Random().nextInt(3);
    @When("user hover on main category")
    public void hover_main_cat(){
        List<WebElement> mainCatList=Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href] "));

        Actions hovermain=new Actions(Hooks.driver);
        hovermain.moveToElement(mainCatList.get(randoemN)).perform();
    }

    @Then("Click an navigate to subcategory")
    public void clickAnNavigateToSubcategory() {
        int x=randoemN+1;

        List<WebElement> subCat=Hooks.driver.findElements(By.xpath
                ("//ul[@class=\"top-menu notmobile\"]/li["+x+"]/ul[@class=\"sublist first-level\"]/li"));
        int randomSub=new Random().nextInt(3);
        String subcategoryName=subCat.get(randomSub).getText().toLowerCase().trim();
        System.out.println("subcategoryName=  "+subcategoryName);
        subCat.get(randomSub).click();
        String excpectedTitle =homePage2.getProductTitie().getText().toLowerCase().trim();
       //String EXP= excpectedTitle.toLowerCase();
        System.out.println("excpectedTitle"+excpectedTitle);
        softAssert.assertTrue(excpectedTitle.contains(subcategoryName));
        softAssert.assertAll();





    }
}
