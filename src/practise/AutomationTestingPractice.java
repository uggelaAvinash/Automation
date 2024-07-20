package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Name
		driver.findElement(By.id("name")).sendKeys("Naveen");
		//email
		driver.findElement(By.id("email")).sendKeys("navi@gmail.com");
		//phone
		driver.findElement(By.id("phone")).sendKeys("78896457787");
	    //by color
	    Select color = new Select(driver.findElement(By.id("colors")));
	    color.selectByValue("blue");
	    //address
	    driver.findElement(By.id("textarea")).sendKeys("vijayawada");
	    //gender
	    driver.findElement(By.id("male")).click();
	    //days
	    List<WebElement> CHK=driver.findElements(By.xpath(""));
	     System.out.println(CHK.size());
	     for(int i=2;i<CHK.size();i++) {
	      CHK.get(i).click();
	     }
	     //country
	  	Select country = new Select(driver.findElement(By.id("country")));
	  	//by index
	  	 country.selectByIndex(9);
	  	  //by value
	     country.selectByValue("australia");
	     //Alert
	     driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
	     Thread.sleep(3000);
	     driver.switchTo().alert().accept();
	     Thread.sleep(3000);
	     //Double click
	     Actions Act=new Actions(driver);
		 WebElement Double = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		 Thread.sleep(3000);
		 Act.doubleClick(Double).perform();
		 //frames
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.name("RESULT_TextField-0")).sendKeys("avinash");
			
	     }
	}
		 
	     
	     
	  	    
	    
	    
	    
	    
		

	

