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
    public void the_tester_is_logged_into_the_console() {
        TestRunner.driver.get("C:/Users/18623/Desktop/Project One/Automation/Foundations-Project/run/src/test/resources/webpages/TesterConsole.html");
    }
    
    @When("the tester waits for webpage to load")
    public void the_tester_waits_for_webpage_to_load() {
        By fetch = By.id("fetching");
        WebElement button = TestRunner.driver.findElement(fetch);
        button.click();
    }

    @When("the tester selects a defect level of priority first")
    public void the_tester_selects_a_defect_level_of_priority_first() {
        By select = By.id("object");
        System.out.println(select);
        WebElement object = TestRunner.driver.findElement(select);
        object.click();
    }
    @When("the tester updates a defect status to accept first")
    public void the_tester_updates_a_defect_status_to_accept_first() {
        By selectElementBy = By.id("condition");
        WebElement condition = TestRunner.driver.findElement(selectElementBy);
        Select c = new Select(condition);
        c.selectByIndex(1);
        
    }

    @When("the tester clicks on button to apply changes first")
    public void the_tester_clicks_on_button_to_apply_changes_first() throws InterruptedException {
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2000);
        TestRunner.driver.switchTo().alert().accept();
    }

    @When("the tester selects a defect level of priority second")
    public void the_tester_selects_a_defect_level_of_priority_second() {
        By select = By.id("object");
        System.out.println(select);
        WebElement object = TestRunner.driver.findElement(select);
        object.click();
    }
    @When("the tester updates a defect status to accept second")
    public void the_tester_updates_a_defect_status_to_accept_second() {
        By selectElementBy = By.id("condition");
        WebElement condition = TestRunner.driver.findElement(selectElementBy);
        Select c = new Select(condition);
        c.selectByIndex(2);
    }

    @When("the tester clicks on button to apply changes second")
    public void the_tester_clicks_on_button_to_apply_changes_second() throws InterruptedException {
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2000);
        TestRunner.driver.switchTo().alert().accept();
    }

    @When("the tester selects a defect level of priority third")
    public void the_tester_selects_a_defect_level_of_priority_third() throws InterruptedException {
        By select = By.id("object");
        System.out.println(select);
        WebElement object = TestRunner.driver.findElement(select);
        object.click();
    }

    @When("the tester updates a defect status to accept third")
    public void the_tester_updates_a_defect_status_to_accept_third() throws InterruptedException {
        By selectElement = By.id("condition");
        WebElement condition = TestRunner.driver.findElement(selectElement);
        Select c = new Select(condition);
        c.selectByIndex(1);
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2000);
        TestRunner.driver.switchTo().alert().accept();
        By selectElementBy = By.id("troubleshoot");
        WebElement troubleshoot = TestRunner.driver.findElement(selectElementBy);
        Select t = new Select(troubleshoot);
        t.selectByIndex(1);
    }

    @When("the tester clicks on button to apply changes third")
    public void the_tester_clicks_on_button_to_apply_changes_third () throws InterruptedException{
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2000);
        TestRunner.driver.switchTo().alert().accept();
    }

    @When("the tester selects a defect level of priority fourth")
    public void the_tester_selects_a_defect_level_of_priority_fourth() {
        By select = By.id("object");
        System.out.println(select);
        WebElement object = TestRunner.driver.findElement(select);
        object.click();
    }
    
    @When("the tester updates a defect status to accept fourth")
    public void the_tester_updates_a_defect_status_to_accept_fourth() throws InterruptedException {
        By selectElement = By.id("condition");
        WebElement condition = TestRunner.driver.findElement(selectElement);
        Select c = new Select(condition);
        c.selectByIndex(1);
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2000);
        TestRunner.driver.switchTo().alert().accept();
        By selectElementBy = By.id("troubleshoot");
        WebElement troubleshoot = TestRunner.driver.findElement(selectElementBy);
        Select t = new Select(troubleshoot);
        t.selectByIndex(2);
    }

    @When("the tester clicks on button to apply changes fourth")
    public void the_tester_clicks_on_button_to_apply_changes_fourth() throws InterruptedException {
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2000);
        TestRunner.driver.switchTo().alert().accept();
    }

    @When("the tester selects a defect level of priority fifth")
    public void the_tester_selects_a_defect_level_of_priority_fifth() {
        By select = By.id("object");
        System.out.println(select);
        WebElement object = TestRunner.driver.findElement(select);
        object.click();
    }

    @When("the tester updates a defect status to accept fifth")
    public void the_tester_updates_a_defect_status_to_accept_fifth() throws InterruptedException {
        By selectElement = By.id("condition");
        WebElement condition = TestRunner.driver.findElement(selectElement);
        Select c = new Select(condition);
        c.selectByIndex(1);
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2000);
        TestRunner.driver.switchTo().alert().accept();
        By selectElementBy = By.id("troubleshoot");
        WebElement troubleshoot = TestRunner.driver.findElement(selectElementBy);
        Select t = new Select(troubleshoot);
        t.selectByIndex(3);
    }

    @When("the tester clicks on button to apply changes fifth")
    public void the_tester_clicks_on_button_to_apply_changes_fifth() throws InterruptedException {
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2000);
        TestRunner.driver.switchTo().alert().accept();
    }

    @Then("you get an alert")
    public void you_get_an_alert() {
        System.out.println("The end.");
    }

}
