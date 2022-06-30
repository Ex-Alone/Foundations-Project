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

    @Given   ("the tester is on the tester console")
    public void the_tester_is_on_the_tester_console(){
        TestRunner.driver.get("C:/Users/18623/Desktop/Project One/Automation/run/src/test/resources/webpages/TesterConsole.html");
    }

    @When    ("the tester selects the defect id")
    public void the_tester_selects_the_defect_id () {
        By id = By.id("defect");
        WebElement defect = TestRunner.driver.findElement(id);
        defect.sendKeys("44756");
    }

    @When    ("the tester updates defect status to approved declined reject fixed or shelved")
    public void the_tester_updates_defect_status_to_approved_or_declined () {
        WebElement selectElement = driver.findElement(By.id("terms"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByIndex(0);
    }

    @When    ("the tester clicks on button to apply changes")
    public void the_tester_clicks_on_button_to_apply_changes () {
        By apply = By.id("button");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
    }

    @Then    ("the tester should be notified of the changes via alert box")
    public void the_tester_should_be_notified_of_the_changes_via_alert_box () {
        
    }

}
