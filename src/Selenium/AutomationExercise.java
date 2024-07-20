package Selenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.Select;

public class AutomationExercise {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		//signup or login
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).click();
		//name
		driver.findElement(By.name("name")).sendKeys("avinash");
		//email
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("bhanu1@gmail.com");
		//signup
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		//title
		driver.findElement(By.id("uniform-id_gender1")).click();
		//password
		driver.findElement(By.id("password")).sendKeys("abhi123");
		//DOB
		//date
		//date
		Select date = new Select(driver.findElement(By.id("days")));
		date.selectByIndex(14);
		//month
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByIndex(1);
		//year
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByIndex(4);
		//first name
		driver.findElement(By.name("first_name")).sendKeys("venkata avinash");
		//last name
		driver.findElement(By.name("last_name")).sendKeys("uggela");
		//company
		driver.findElement(By.name("company")).sendKeys("Qualcomm");
		//address1
		driver.findElement(By.name("address1")).sendKeys("5-31, hanuman street vijayawada,");
		//address2
		driver.findElement(By.name("address2")).sendKeys("hyderabad");
		//country
		Select country =new Select(driver.findElement(By.name("country")));
		country.selectByIndex(0);
		//state
		driver.findElement(By.id("state")).sendKeys("Andhra pradesh");
		//city
		driver.findElement(By.id("city")).sendKeys("vijayawada");
		//zipcode
		driver.findElement(By.id("zipcode")).sendKeys("521226");
		//mobile number
		driver.findElement(By.id("mobile_number")).sendKeys("7897889433");
		//create account
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
		     }	
		
		
	}
	