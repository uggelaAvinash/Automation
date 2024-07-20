package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/insurance/v1/register.php");
	driver.manage().window().maximize();
	Select title = new Select(driver.findElement(By.name("title")));
	//By Index
	title.selectByIndex(4);
	Thread.sleep(3000);
	////Value
	title.selectByValue("Mr");
	Thread.sleep(3000);
	//Visible text
	title.selectByVisibleText("Major");
	//year
	Select year = new Select(driver.findElement(By.name("year")));
	year.selectByIndex(2);
	//month
	Select month = new Select(driver.findElement(By.name("month")));
	month.selectByIndex(4);
	//date
	Select date = new Select(driver.findElement(By.name("date")));
	date.selectByIndex(3);
	//License
	Select licence = new Select(driver.findElement(By.name("licenceperiod")));
	licence.selectByIndex(3);
	

	}

}
