package com.kronosek.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kronosek.steps.AdminConsole;
import com.kronosek.steps.LoginAsTester;
import com.kronosek.steps.TesterConsole;
import com.kronosek.steps.LoginAsManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/kronosek/steps")
public class TestRunner {

    public static WebDriver driver;
    public static LoginAsManager loginAsManager;
    public static LoginAsTester loginAsTester;
    public static AdminConsole adminConsole;
    public static TesterConsole testerConsole;
    public static TestRunner testRunner;
    public static WebDriverWait wait;
    public static Object button;

    @BeforeClass 
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        loginAsManager = new LoginAsManager();
        loginAsTester = new LoginAsTester();
        new TestRunner();
        new AdminConsole();
        testerConsole = new TesterConsole();
        wait = new WebDriverWait(driver, 2);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();
    }
    
}