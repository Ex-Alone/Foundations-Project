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

    void defectId(){
        By select = By.id("object");
        System.out.println(select);
        WebElement object = TestRunner.driver.findElement(select);
        object.click();
    }

    void approval(int x){
        By selectElementBy = By.id("condition");
        WebElement condition = TestRunner.driver.findElement(selectElementBy);
        Select c = new Select(condition);
        c.selectByIndex(x);
    }

    void update() throws InterruptedException{
        By apply = By.id("update");
        WebElement button = TestRunner.driver.findElement(apply);
        button.click();
        Thread.sleep(2250);
        TestRunner.driver.switchTo().alert().accept();
    }

    void troubleshoot(int x){
        By selectElementBy = By.id("troubleshoot");
        WebElement troubleshoot = TestRunner.driver.findElement(selectElementBy);
        Select t = new Select(troubleshoot);
        t.selectByIndex(x);
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
        defectId();
    }

    @When("the tester updates a defect status to accept first")
    public void the_tester_updates_a_defect_status_to_accept_first() {
        int x = 1;
        approval(x);
    }

    @When("the tester clicks on button to apply changes first")
    public void the_tester_clicks_on_button_to_apply_changes_first() throws InterruptedException {
        update();
    }

    @When("the tester selects a defect level of priority second")
    public void the_tester_selects_a_defect_level_of_priority_second() {
        defectId();
    }
    @When("the tester updates a defect status to accept second")
    public void the_tester_updates_a_defect_status_to_accept_second() {
        int x = 2;
        approval(x);
    }

    @When("the tester clicks on button to apply changes second")
    public void the_tester_clicks_on_button_to_apply_changes_second() throws InterruptedException {
        update();
    }

    @When("the tester selects a defect level of priority third")
    public void the_tester_selects_a_defect_level_of_priority_third() throws InterruptedException {
        defectId();
    }

    @When("the tester updates a defect status to accept third")
    public void the_tester_updates_a_defect_status_to_accept_third() throws InterruptedException {
        int x = 1;
        approval(x);
        update();
        int a = 1;
        troubleshoot(a);
    }

    @When("the tester clicks on button to apply changes third")
    public void the_tester_clicks_on_button_to_apply_changes_third () throws InterruptedException{
        update();
    }

    @When("the tester selects a defect level of priority fourth")
    public void the_tester_selects_a_defect_level_of_priority_fourth() {
        defectId();
    }

    @When("the tester updates a defect status to accept fourth")
    public void the_tester_updates_a_defect_status_to_accept_fourth() throws InterruptedException {
        int x = 1;
        approval(x);
        update();
        int b = 2;
        troubleshoot(b);
    }

    @When("the tester clicks on button to apply changes fourth")
    public void the_tester_clicks_on_button_to_apply_changes_fourth() throws InterruptedException {
        update();
    }

    @When("the tester selects a defect level of priority fifth")
    public void the_tester_selects_a_defect_level_of_priority_fifth() {
        defectId();
    }

    @When("the tester updates a defect status to accept fifth")
    public void the_tester_updates_a_defect_status_to_accept_fifth() throws InterruptedException {
        int x = 1;
        approval(x);
        update();
        int c = 3;
        troubleshoot(c);
    }

    @When("the tester clicks on button to apply changes fifth")
    public void the_tester_clicks_on_button_to_apply_changes_fifth() throws InterruptedException {
        update();
    }

    @Then("you get an alert")
    public void you_get_an_alert() {
        System.out.println("The end.");
    }

}