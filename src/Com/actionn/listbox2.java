package Com.actionn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class listbox2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//WebElement web=driver.findElement(By.xpath("//select[@id='month']"));
WebElement web=        driver.findElement(By.xpath("//select[@id='month']"));


Actions actions=new Actions(driver);
actions.click(web).perform();
	actions.sendKeys(Keys.END).perform();
	Thread.sleep(400);
	
	for(int i=1;i<=8;i++) {
	actions.sendKeys(Keys.ARROW_UP).perform();
	
	}
	Thread.sleep(400);
	actions.sendKeys(Keys.ENTER).perform();
	
	//driver.manage().timeouts().implicitlyWait(, null)
	
}

}
