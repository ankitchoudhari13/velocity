package cm.fram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class login1 {
	
	Login login;
	yearofbirth birth;
	Welcomepage wel;
	homepage homepage;
	FileInputStream ff;
	
	@BeforeClass
	
	  
	  public void beforeMethod() throws FileNotFoundException {
		              ff=new FileInputStream("");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://login-v2.upstox.com/");
		    driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		     login=new Login(driver);
		    login.enter();
		    
			 birth=new yearofbirth(driver);
			birth.yearbirthh();
			 driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
			 wel=new Welcomepage(driver);
			wel.noiam();
			 driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
			
			 homepage=new homepage(driver);
			homepage.userver();
	  }

	@BeforeMethod
	  public void beforeClass() {
	  }

	  
	  
	  @Test
	  public void f() {
	  }

	 
	  @AfterClass
	  public void afterClass() {
	  }

	  
	  @AfterMethod
	  public void afterMethod() {
	  }
	  
}
