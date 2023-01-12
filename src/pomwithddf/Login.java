package pomwithddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	
	
		
@FindBy(xpath="//input[@id='userCode']")private WebElement un;
@FindBy(xpath="//input[@id='password']")private WebElement pass;
@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement button;


	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void enter() {
		
		un.sendKeys("3WAT7Y");
		pass.sendKeys("Ankit@1995");
		button.click();
		
	}

}
