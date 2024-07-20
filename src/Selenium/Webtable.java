package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webtable {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String webtable=driver.findElement(By.name("BookTable")).getText();
		System.out.println(webtable);
		
		System.out.println("webtable head coloumn is");
		String webtablehead=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]")).getText();
		System.out.println(webtablehead);
	}

}
