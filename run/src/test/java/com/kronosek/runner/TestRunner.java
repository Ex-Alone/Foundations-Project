package com.kronosek.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //annotations change at runtime, telling Junit other dependancies working with
    /*
     * features: this tells Cucumber where the feature files are located: this can be a folder or a direct
     * path to individual feature files: below are just listing the folder that holds the feature files
     * 
     * glue: this tells Cucumber where the code is located to implement each step of the acceptance criteria.
     * You can put the path to either individual java files, or the package that holds all the steps
     */
@CucumberOptions(features="classpath:features", glue="com/kronosek/steps")
public class TestRunner{
    //this class will handle setting up the automation code and tearing it down when it is done

    /* 
     * this class will be Junit's contribution to our automation code: it provides the means of setting up
     * al of our data for automation tests, and then it closes down all the necessary tools we use so that
     * our application doesn't eat up all our memory
     */

    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.out.println("This method runs before the steps");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //reference to chrome driver: this is how we let code know where chrome driver is
        driver = new ChromeDriver();
        //we set driver field to be a ChromeDriver object, now ready to interact with Chrome
    }

    @AfterClass
    public static void teardown(){
        System.out.println("This method runs after the steps");
        //driver.quit(); //closes driver so we don't have to manually close it
    }

}