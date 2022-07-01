package com.kronosek.runner;

//import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kronosek.steps.AdminConsole;
import com.kronosek.steps.LoginAsManager;
import com.kronosek.steps.LoginAsTester;
import com.kronosek.steps.TesterConsole;

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
    public static TestRunner testerRunner;
    public static WebDriverWait wait;

    @BeforeClass // this makes the method execute before all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        loginAsManager = new LoginAsManager();
        loginAsTester = new LoginAsTester();
        adminConsole = new AdminConsole();
        testerRunner = new TestRunner();
        testerConsole = new TesterConsole();
        // the WebDriverWait is used to tell Selenium to wait up to a set amount of time for a given condition
        wait = new WebDriverWait(driver, 2);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown(){
        driver.quit();
    }
    
}