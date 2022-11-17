package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D01_registerStepDef
{
    SoftAssert softAssert = new SoftAssert();
    RegisterPage registerPage =new RegisterPage();
    @Given("user go to register page")
    public void go_to_register()
    {
       // System.out.println("This is a test before start coding");
        registerPage.registerlink().click();

    }
    @When("user select gender type")
    public void select_gender(){
        registerPage.sGenderRbutton().click();
    }

    @And("user enter first name and last name")
    public void enter_name(){
        registerPage.sFirstName().sendKeys("automation");
        registerPage.sLasttName().sendKeys("tester");
    }

    @And("user enter date of birth")
    public void select_dayOfBirth(){
        registerPage.sDdayOfBirth().sendKeys("1");
        registerPage.sMonthOfBirth().sendKeys("January");
        registerPage.sYearOfBirth().sendKeys("1991");
    }
    @And("user enter email")
    public void enter_email(){
        registerPage.SEmail().sendKeys("testAmr@example.com");

    }
    @And("user fills Password fields")
    public void enter_password(){
        registerPage.sPassword().sendKeys("P@ssw0rd");
        registerPage.sConfirmPassword().sendKeys("P@ssw0rd");
    }
    @Then("user clicks on register button")
    public void click_register()
    {
        registerPage.sRegisterButton().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @And("success message is displayed")
    public void check_message()
    {
        String expectedMessage="";
        String expectedColor="#4cb17c";
        String actualColor=registerPage.sColor().getCssValue("color");
        String actual =registerPage.sRegisterConfirmMessage().getText();
        softAssert.assertTrue(actual.contains(expectedMessage));
        softAssert.assertTrue(actualColor.contains(expectedColor));

    }


}
