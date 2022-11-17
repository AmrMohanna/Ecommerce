package org.example.stepDefs;

import com.beust.ah.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;


public class D06_homeSlidersStepDef {
    P03_homePage homePage=new P03_homePage();
    SoftAssert softAssert=new SoftAssert();


    @When("usre select first")
    public void selectNokia()
    {
       List<WebElement>list1 =homePage.selectSlider();

        list1.get(0).click();
        list1.size();
        System.out.println(list1.size());
        String actualURL=Hooks.driver.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL="https://demo.nopcommerce.com/nokia-lumia-1020";
        softAssert.assertTrue(actualURL.contains(expectedURL));
        softAssert.assertAll();

    }




    @When("usre select second")
    public void selectiphone() throws InterruptedException {
        List<WebElement>list2 =homePage.selectSlider();
        Actions action =new Actions(Hooks.driver);

        Thread.sleep(4000);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        list2.size();
        System.out.println(list2.size());
        String actualURL=Hooks.driver.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL="https://demo.nopcommerce.com/iphone-6";
        softAssert.assertTrue(actualURL.contains(expectedURL));
        softAssert.assertAll();
    }




}
