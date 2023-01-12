package Javascriptt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	
	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	   driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	    
	 Thread.sleep(1000);
	    
	   // ((JavascriptExecutor)driver).executeScript("arguments[0].scrolllntoView();", facebook);
	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", facebook);
		
		
		
	}

}
