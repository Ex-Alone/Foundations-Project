package com.kronosek.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.kronosek.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterConsole {
    
    WebDriver driver;

    @Given   ("the tester is logged into the console")
    public void the_tester_is_logged_into_the_console (){
        TestRunner.driver.get("C:/Users/18623/Desktop/Project One/Automation/run/src/test/resources/webpages/TesterConsole.html");
    }

    @When    ("the tester selects the defect id by level of priority")
    public void the_tester_selects_the_defect_id_by_level_of_priority () {
        By id = By.id("defectId");
        WebElement defect = TestRunner.driver.findElement(id);
        defect.sendKeys("44756");
    }

    @When    ("the tester updates defect status to approved declined rejected fixed or shelved")
    public void the_tester_updates_defect_status_to_approved_declined_rejected_fixed_or_shelved () {
        WebElement select = driver.findElement(By.id("condition"));
        Select options = new Select(select);
        options.selectByIndex(0);
    }

    @When    ("the tester clicks on button to apply changes")
    public void the_tester_clicks_on_button_to_apply_changes () {
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
    }

    @Then    ("the tester should be notified of the changes via an alert box")
    public void the_tester_should_be_notified_of_the_changes_via_an_alert_box () {
        
    }

}
