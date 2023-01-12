package cm.fram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	
	
	@FindBy(xpath ="//div[text()='No, I’m good']")	private WebElement  noiamgood;

	public Welcomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void noiam() {
		
		
		noiamgood.click();;
	}

	}



