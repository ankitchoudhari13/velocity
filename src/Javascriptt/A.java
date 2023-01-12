package Javascriptt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	   // driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    
	   // ((JavascriptExecutor)driver).executeScript(("window.scrollBy(0,4000)"));
	    
	    //((JavascriptExecutor)driver).executeScript(("window.scrollBy(0,-1000)"));
	    
	    
	    
	    //right
	    
	    ((JavascriptExecutor)driver).executeScript(("window.scrollBy(300,000)"));
	    
	    
	    //left
	    
	    ((JavascriptExecutor)driver).executeScript(("window.scrollBy(-100,000)"));
	  //  (JavascriptExecutor)
	    

	}

}
