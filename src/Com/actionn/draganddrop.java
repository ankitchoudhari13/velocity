package Com.actionn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ankit\\\\Desktop\\\\selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement src=       driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
	WebElement dis=       driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));

	
	Actions actions=new Actions(driver);
	//actions.dragAndDrop(src, dis).perform();
	actions.moveToElement(src).clickAndHold().moveToElement(dis).release().build().perform();
	
		
		
		
	}
}
