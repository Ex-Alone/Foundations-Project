package com.kronosek.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.kronosek.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAsManager {

    public LoginAsManager() {
    }

    @Given("the manager is on the login page")
    public void the_manager_is_on_the_login_page (){
        TestRunner.driver.get("C:/Users/18623/Desktop/Project One/Automation/Foundations-Project/run/src/test/resources/webpages/LoginAs.html");
    }

    @When("the manager enters the correct username")
    public void the_manager_enters_the_correct_username (){
        By usernameInfo = By.id("username");
        WebElement username = TestRunner.driver.findElement(usernameInfo);
        username.sendKeys("Eric");
    }

    @When("the manager enters the correct password")
    public void the_manager_enters_the_correct_password (){
        By passwordInfo = By.id("password");
        WebElement password = TestRunner.driver.findElement(passwordInfo);
        password.sendKeys("pass");
    }

    @When("the manager clicks on the login button")
    public void the_manager_clicks_on_the_login_button (){
        By loginButton = By.id("login");
        WebElement login = TestRunner.driver.findElement(loginButton);
        login.click();
    }

    @Then("the manager should be logged in")
    public void the_manager_should_be_logged_in (){
        System.out.println("I executed");
    }
}
