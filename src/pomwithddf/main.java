package pomwithddf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated constructor stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://login-v2.upstox.com/");
	    driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	    Login login=new Login(driver);
	    login.enter();
	    
		yearofbirth birth=new yearofbirth(driver);
		birth.yearbirthh();
		 driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		Welcomepage wel=new Welcomepage(driver);
		wel.noiam();
		 driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		
		homepage homepage=new homepage(driver);
		homepage.userver();
		
		
	}
	
	
	
	

}
