package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebElement go_to_loginPage()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement sLoginbutton(){
       return Hooks.driver.findElement(By.partialLinkText("Log"));
    }
    public String redirect_to_home(){
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement get_wrongMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("form[novalidate=\"novalidate\"]"));
    }
    public WebElement get_Color()
    {
        return Hooks.driver.findElement(By.cssSelector("form[novalidate=\"novalidate\"]"));
    }
    public WebElement get_MyAccount()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
}
