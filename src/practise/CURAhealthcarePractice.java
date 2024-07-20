package practise;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CURAhealthcarePractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		driver.manage().window().maximize();
		//login
		//username
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		//password
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		//login
		driver.findElement(By.id("btn-login")).click();
		Thread.sleep(3000);
		//facility
		Select facility=new Select(driver.findElement(By.id("combo_facility")));
		facility.selectByIndex(1);
		//healthcare program
		driver.findElement(By.xpath("//*[@id=\"appointment\"]/div/div/form/div[3]/div/label[2]")).click();
		//comment
		driver.findElement(By.id("txt_comment")).sendKeys("Hi everyone");
		//book appointment
		driver.findElement(By.id("btn-book-appointment")).click();
		Thread.sleep(3000);

	}

}
