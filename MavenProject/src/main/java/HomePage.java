

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
	WebDriver driver;
	By myacc=By.linkText("My Account");

	 public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickOnMyAcc() {
		driver.findElement(myacc).click();
		
	}
	
}
