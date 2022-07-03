package com.kronosek.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.kronosek.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminConsole {
    
    WebDriver driver;
   
    @Given("the manager is on the admin console")
    public void the_manager_is_on_the_admin_console (){
        TestRunner.driver.get("C:/Users/18623/Desktop/Project One/Automation/Foundations-Project/run/src/test/resources/webpages/AdminConsole.html");
    }

    @When("the manager types description of defect in text field")
    public void the_manager_types_description_of_defect_in_text_field (){
        By name = By.id("tester");
        WebElement tester = TestRunner.driver.findElement(name);
        tester.sendKeys("David17");
    }

    @When("the manager assigns defect to tester")
    public void the_manager_assigns_defect_to_tester (){
        By securityAlert = By.id("defect");
        WebElement defect = TestRunner.driver.findElement(securityAlert);
            
        int classB = 172;
        int octect2 = (int)(Math.random() * 16) + 16;
        int octect3 = (int)(Math.random() * 255) + 0;
        int octect4 = (int)(Math.random() * 254) + 1;

        defect.sendKeys(Integer.toString(classB));
        defect.sendKeys(".");
        defect.sendKeys(Integer.toString(octect2));
        defect.sendKeys(".");
        defect.sendKeys(Integer.toString(octect3));
        defect.sendKeys(".");
        defect.sendKeys(Integer.toString(octect4));
    
    }//₿
        
    @Then("the manager clicks on the submit button and ok on the alert box")
    public void the_manager_clicks_on_the_submit_button_and_ok_the_alert_box () throws InterruptedException{
        By submitButton = By.id("submit");
        WebElement submit = TestRunner.driver.findElement(submitButton);
        submit.click();
        //TestRunner.driver.switchTo().alert().accept();
    }

}
