package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }
    public WebElement sGenderRbutton(){
        return Hooks.driver.findElement(By.id("gender-male"));

    }
    public WebElement sFirstName()
    {
        return Hooks.driver.findElement(By.id("FirstName"));

    }
    public WebElement sLasttName()
    {
        return Hooks.driver.findElement(By.id("LastName"));

    }
    public WebElement sDdayOfBirth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement sMonthOfBirth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));

    }
    public WebElement sYearOfBirth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));

    }
    public WebElement SEmail()
    {
        return Hooks.driver.findElement(By.id("Email"));

    }
    public WebElement sPassword()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement sConfirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement sRegisterButton()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement sRegisterConfirmMessage()
    {
        return Hooks.driver.findElement(By.className("result"));
    }public WebElement sColor()
    {
        return Hooks.driver.findElement(By.className("result"));
    }


}

