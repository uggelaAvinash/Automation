package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
	System.setProperty("C:\\Program Files\\Java\\chromedriver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	Actions Act=new Actions(driver);
	Act.dragAndDropBy(slider, 200, 0).perform();

	}

}
