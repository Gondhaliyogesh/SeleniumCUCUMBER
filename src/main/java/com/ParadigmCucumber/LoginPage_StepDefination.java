package com.ParadigmCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage_StepDefination 
{
	WebDriver driver;

	@Given("^Open Paradigm Application$")
	public void open_Paradigm_Application() throws Throwable
	{

		WebDriverManager.firefoxdriver().setup();

		driver= new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://portal-test.beta.paradigm-claims.com/");

	}

	@When("^Enter username and Password$")
	public void enter_username_and_Password() throws Throwable 
	{

		driver.findElement(By.id("email")).sendKeys("superadmin@paradigmclaims.com");
		driver.findElement(By.id("password")).sendKeys("paradigm@123");

	}

	@Then("^User Access Login Page$")
	public void user_Access_Login_Page() throws Throwable 
	{

		driver.findElement(By.xpath("//*[@id='main-wrapper']/app-body/div/ng-component/div/div/div/div[2]/div/form/div[5]/button")).click();

	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable 
	{
		Thread.sleep(5000);

		driver.close();
	}




}
