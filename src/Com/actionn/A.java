package Com.actionn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class A {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ankit\\\\Desktop\\\\selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  WebElement web=     driver.findElement(By.xpath("//a[text()='Login']"));
	       
	       Actions actions=new Actions(driver);
	       actions.moveToElement(web).perform();
	       actions.moveToElement(web).build();
	       
	    //   driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
	   //    actions.moveToElement(web).contextClick().build().perform();
	       
	       actions.contextClick().perform();
	       
	       
	}
}
