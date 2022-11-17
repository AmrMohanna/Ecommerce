package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
     public static WebDriver driver = null;
     @Before
    public static void OpenBrowser()
    {
        //2- to call chrome driver
        String chromepath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromepath);
        // 2 create object from chrome driver
        driver=new ChromeDriver();
        // 3-Manage
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //4- navigate to url
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public void closeDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
