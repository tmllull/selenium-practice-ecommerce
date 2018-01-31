package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert; 

public class CheckOutScreen extends Screen {
	By totalPrice = By.id("total_price");
	public CheckOutScreen(WebDriver driver) {
		super(driver);
	}
	
	public void checkTotalPrice(String expectedPrice) throws Exception {
		WebElement totalPriceElement=this.waitForElementVisibility(totalPrice);
		org.junit.Assert.assertTrue(totalPriceElement.getText().compareTo(expectedPrice)==0);
	}

}
