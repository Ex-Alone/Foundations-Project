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
    int binary;
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
            
            int i = 0;
            while (i<8){ //setting up ipv4 address to ping class a b c
                binary = (int)(Math.random() * 2) + 0;
                defect.sendKeys(Integer.toString(binary));
                i++;
            }//₿
            defect.sendKeys(".");
            i=0;
            defect.sendKeys(Integer.toString(binary));
            while (i<8){ //setting up ipv4 address to ping class a b c
                binary = (int)(Math.random() * 2) + 0;
                defect.sendKeys(Integer.toString(binary));
                i++;
            }//₿
            defect.sendKeys(".");
            i=0;
            defect.sendKeys(Integer.toString(binary));
            while (i<8){ //setting up ipv4 address to ping class a b c
                binary = (int)(Math.random() * 2) + 0;
                defect.sendKeys(Integer.toString(binary));
                i++;
            }//₿
            defect.sendKeys(".");
            i=0;
            while (i<8){ //setting up ipv4 address to ping class a b c
                binary = (int)(Math.random() * 2) + 0;
                defect.sendKeys(Integer.toString(binary));
                i++;
            }//₿
        
    }
        
    @When("the manager selects a priority level")
    public void the_manager_selects_a_priority_level (){//skipped for now, randomized in javascript
        // int e = (int)(Math.random() * 3) + 0;
        // By selectElementBy = By.id("priority");
        // WebElement priority = TestRunner.driver.findElement(selectElementBy);
        // Select i = new Select(priority);
        // if(e == 1){
        //     i.selectByIndex(0);
        // }else if(e == 2){
        //     i.selectByIndex(1);
        // }else if(e == 3){
        //     i.selectByIndex(2);
        // }
        
        System.out.println("What is the value of this: ");
    }


    @Then("the manager clicks on the submit button and ok on the alert box")
    public void the_manager_clicks_on_the_submit_button_and_ok_the_alert_box (){
        By submitButton = By.id("submit");
        WebElement submit = TestRunner.driver.findElement(submitButton);
        submit.click();
        //TestRunner.driver.switchTo().alert().accept();
    }

    

}
