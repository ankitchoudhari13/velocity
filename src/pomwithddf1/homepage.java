package pomwithddf1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
@FindBy(xpath ="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private	WebElement profile;


public homepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	PageFactory.initElements(driver, this);
}

public void userver() {
String act=	profile.getText();
String exp="Ankit";

if (act.contains(exp)) {
	
	System.out.println("pass");
	
} else {
	System.out.println("fail");

}
}

}
