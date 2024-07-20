package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) {
    WebDriver driver=new EdgeDriver();
    driver.get("http://demo.guru99.com/test/drag_drop.html");
    driver.manage().window().maximize();
    WebElement Bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
    WebElement Drop=driver.findElement(By.id("bank"));
    
    Actions Act= new Actions(driver);
    Act.dragAndDrop(Bank, Drop).perform();
    
    WebElement Element2=driver.findElement(By.id("fourth"));
    WebElement Drop2=driver.findElement(By.id("amt7"));
    
    Actions Action= new Actions(driver);
    Action.dragAndDrop(Element2, Drop2).perform();
    
    WebElement Element3=driver.findElement(By.id("credit2"));
    WebElement Drop3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
    
    Actions action = new Actions(driver);
    action.dragAndDrop(Element3, Drop3).perform();
    
    
    
	}

}
