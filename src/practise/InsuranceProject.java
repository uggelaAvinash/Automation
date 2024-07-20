package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceProject {

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
	//First name
	driver.findElement(By.id("user_firstname")).sendKeys("avinash");
	//surname
	driver.findElement(By.id("user_surname")).sendKeys("uggela");
	//phone
	driver.findElement(By.id("user_phone")).sendKeys("7868954870");
	//year
			Select year = new Select(driver.findElement(By.name("year")));
			year.selectByIndex(2);
			//month
			Select month = new Select(driver.findElement(By.name("month")));
			month.selectByIndex(4);
			//date
			Select date = new Select(driver.findElement(By.name("date")));
			date.selectByIndex(3);
			//licence
			Select licence = new Select(driver.findElement(By.name("licenceperiod")));
			licence.selectByIndex(3);
			//occupation
			Select occupation = new Select(driver.findElement(By.id("user_occupation_id")));
			occupation.selectByIndex(3);
			//address street
			driver.findElement(By.id("user_address_attributes_street")).sendKeys("hanuman street");
			//city
			driver.findElement(By.id("user_address_attributes_city")).sendKeys("hyderabad");
			//country
			driver.findElement(By.id("user_address_attributes_county")).sendKeys("india");
			//post code
			driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("675742");
			//email
			driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("gdjdf@gmail.com");
			//password
			driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("gdjn@#jj");
			//confirm password
			driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("gdjn@#jj");
			//create 
			driver.findElement(By.name("submit")).click();
			
			
			//login
			//email
			driver.findElement(By.id("email")).sendKeys("gdjdf@gmail.com");
			//password
			driver.findElement(By.id("password")).sendKeys("gdjn@#jj");
			//login button
			driver.findElement(By.name("submit")).click();
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
