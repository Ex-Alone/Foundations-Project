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

    public TesterConsole() {
    }

    @Given("the tester is logged into the console")
    public void the_tester_is_logged_into_the_console (){
        TestRunner.driver.get("C:/Users/18623/Desktop/Project One/Automation/Foundations-Project/run/src/test/resources/webpages/TesterConsole.html");
    }

    @When("the tester waits for webpage to load")
    public void the_tester_waits_for_webpage_to_load () {
        By fetch = By.id("fetching");
        WebElement button = TestRunner.driver.findElement(fetch);
        button.click();
    }

    @When("the tester selects the defect id by level of priority")
    public void the_tester_selects_the_defect_id_by_level_of_priority () {
        By id = By.id("object");
        WebElement defectId = TestRunner.driver.findElement(id);
        defectId.sendKeys("19006");
    }

    @When("the tester updates defect status to fixed")
    public void the_tester_updates_defect_status_to_fixed (String Fixed) {
        By selectElementBy = By.id("troubleshoot");
        WebElement troubleshoot = TestRunner.driver.findElement(selectElementBy);
        Select t = new Select(troubleshoot);
        t.selectByIndex(1);
    }

    @When("the tester clicks on button to apply changes")
    public void the_tester_clicks_on_button_to_apply_changes () {
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
    }

    @Then("the tester should be notified of the changes an via terminal")
    public void the_tester_should_be_notified_of_the_changes_an_via_terminal() {
        System.out.println("the end.");
    }

}
