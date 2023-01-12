package Autosugetion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	    
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		   driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
List<WebElement> ll=		driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
String str1="redmi note 10";
		for (WebElement webElement : ll) {
			
		String str=	webElement.getText();
		if(str.equals(str1)) {
			webElement.click();
			break;
		}
			
		}
		
		
		
		
	}

}
