package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ACEEngenneringPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.aceenggacademy.com/enquire-now/");
		driver.manage().window().maximize();
		//name
		driver.findElement(By.id("input_26_1")).sendKeys("ram");
		//email
		driver.findElement(By.id("input_26_2")).sendKeys("ram@gmail.com");
		//phone 
		driver.findElement(By.id("input_26_8")).sendKeys("7857698409");
		//center
		Select center = new Select(driver.findElement(By.id("input_26_4")));
		//index
		 center.selectByIndex(10);
		 //value
		 center.selectByValue("vijayawada");
		 //stream
		 Select stream = new Select(driver.findElement(By.id("input_26_9")));
		  stream.selectByIndex(2);
		  Thread.sleep(2000);
		  stream.selectByValue("Mechanical Engineering");
		  //query
		  driver.findElement(By.id("input_26_5")).sendKeys("i want to know more details");
		 
		 
			
		 
			 
		 
		
	}

}
