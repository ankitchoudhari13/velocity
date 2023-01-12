package HandlingMultipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\OneDrive\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	List<WebElement> al=	driver.findElements(By.xpath("//a"));
	
	for (WebElement webElement : al) {
		System.out.println(webElement.getText());
	}
	}

}
