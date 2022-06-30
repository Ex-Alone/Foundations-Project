package com.kronosek.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.kronosek.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminConsole {
    
    WebDriver driver;

    @Given("the manager is on the admin console")
    public void the_manager_is_on_the_admin_console (){
        TestRunner.driver.get("C:/Users/18623/Desktop/Project One/Automation/run/src/test/resources/webpages/AdminConsole.html");
    }

    @When("the manager types description of defect in text field")
    public void the_manager_types_description_of_defect_in_text_field (){
        By name = By.id("tester");
        WebElement tester = TestRunner.driver.findElement(name);
        tester.sendKeys("David");
    }

    @When("the manager assigns defect to tester")
    public void the_manager_assigns_defect_to_tester (){
        By description = By.id("defect");
        WebElement defect = TestRunner.driver.findElement(description);
        //defect.sendKeys("CISCO Access Points (security exploit)");
        defect.sendKeys("RedHat Support (malware)");
        //defect.sendKeys("RansomWare! ₿ (new deadline)"); //₿
    }

    @When("the manager selects a priority level")
    public void the_manager_selects_a_priority_level (){
        WebElement selectElement = driver.findElement(By.id("priority"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("High");
    }

    @When("the manager clicks on the submit button")
    public void the_manager_clicks_on_the_submit_button (){
        By submitButton = By.id("submit");
        WebElement submit = TestRunner.driver.findElement(submitButton);
        submit.click();
    }

    @Then("the manager should see an alert")
    public void the_manager_should_see_an_alert (){
        System.out.println("I executed");
    }
}
