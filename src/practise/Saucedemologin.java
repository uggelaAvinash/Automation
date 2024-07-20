package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Saucedemologin {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("C:\\Program Files\\Java\\geckodriver", "geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	//login
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//password
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//login button
	driver.findElement(By.id("login-button")).click();
	//add to cart
	driver.findElement(By.id("add-to-cart")).click();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	

	}

}
