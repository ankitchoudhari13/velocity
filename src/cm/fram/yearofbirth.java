package cm.fram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yearofbirth {
	
@FindBy(xpath ="//input[@id='yob']") private	WebElement  date;

public yearofbirth(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

public void yearbirthh() {
	
	
	date.sendKeys("1994");
}

}
