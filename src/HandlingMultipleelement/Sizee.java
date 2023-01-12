package HandlingMultipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sizee {
	
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	List<WebElement> al=	driver.findElements(By.xpath("//a"));
	
int size=	al.size();
System.out.println(size);
	
	for (WebElement webElement : al) {
		System.out.println(webElement.getText());
	}
	}




}
