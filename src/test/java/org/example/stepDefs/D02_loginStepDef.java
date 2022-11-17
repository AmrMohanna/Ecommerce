package org.example.stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;
import org.example.pages.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D02_loginStepDef {
    RegisterPage registerPage =new RegisterPage();
    LoginPage loginPage=new LoginPage();
    SoftAssert softAssert=new SoftAssert();
    @Given("user go to login page")
    public void go_to_login()
    {
        loginPage.go_to_loginPage().click();

    }

    @When("user login with valid data")
    public void enter_valid_data(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        registerPage.SEmail().sendKeys("testAmr@example.com");
        registerPage.sPassword().sendKeys("P@ssw0rd");
    } @When("user login with Invalid data")
    public void enter_INvalid_data(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        registerPage.SEmail().sendKeys("tttestAmr@example.com");
        registerPage.sPassword().sendKeys("P@ssw0rd");
    }
    @Then("user click on login button")
    public void click_login()
    {
        //loginPage.sLoginbutton().click();
        registerPage.sPassword().sendKeys(Keys.ENTER);

    }
    @And("user login to the system successfully")
    public void check_confirm_login(){
        String expectetLink="https://demo.nopcommerce.com/";
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),expectetLink);
        softAssert.assertTrue(loginPage.get_MyAccount().isDisplayed(),"not displayed");
        softAssert.assertAll();

    }
    @And("user can not login to the system successfully")
    public void check_confirm_not_login(){
       String expectedColor="rgba(119, 119, 119, 1)";
       String actualColor=loginPage.get_wrongMessage().getCssValue("color");
        //String actualColor1=Color.fromString(actualColor).asHex();
        softAssert.assertTrue(actualColor.contains(expectedColor));
       System.out.println(actualColor);
        String expecteMessage="Login was unsuccessful.";
        String actulaMessage=  loginPage.get_wrongMessage().getText();
        System.out.println(actulaMessage);
        softAssert.assertTrue(actulaMessage.contains(expecteMessage));

        softAssert.assertAll();


    }


}
