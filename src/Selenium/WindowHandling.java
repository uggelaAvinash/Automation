package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.linkText("Selenium in biology")).click();
		driver.findElement(By.linkText("Selenium (software)")).click();
		driver.findElement(By.linkText("Selenium disulfide")).click();
		driver.findElement(By.linkText("Selenium dioxide")).click();
		Set<String> WINID =driver.getWindowHandles();
		
		for(String WIN:WINID)
		{
		   String title=driver.switchTo().window(WIN).getTitle();
		   if(title.equals("Selenium - Wikipedia"))
		   {
			driver.findElement(By.id("p-lang-btn-checkbox")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul[2]/li[4]/a")).click();
			
		   }
		   if(title.equals("Selenium in biology - Wikipedia"))
		   {
			driver.findElement(By.id("vector-page-tools-dropdown-checkbox")).click();
			driver.findElement(By.xpath("//*[@id=\"t-info\"]/a/span")).click();
		   }
			 if(title.equals("Selenium (software) - Wikipedia"))
			   {
				driver.findElement(By.id("vector-page-tools-dropdown-checkbox")).click();
				driver.findElement(By.xpath("//*[@id=\"t-urlshortener-qrcode\"]/a/span")).click();
			   }
			 if(title.equals("Selenium disulfide - Wikipedia"))
			   {
				driver.findElement(By.id("vector-page-tools-dropdown-checkbox")).click();
				driver.findElement(By.xpath("//*[@id=\"t-specialpages\"]/a/span")).click();
			   }
			 if(title.equals("Selenium dioxide - Wikipedia"))
			   {
				driver.findElement(By.id("vector-page-tools-dropdown-checkbox")).click();
				driver.findElement(By.xpath("//*[@id=\"coll-download-as-rl\"]/a/span")).click();
			   }
			
		}
			   }
		   
		}
		

	


