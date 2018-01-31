package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LandingPage extends Screen {
	
	private By quantityWantedField = By.id("quantity_wanted");
	private By addToCartButton = By.id("add_to_cart");
	private By goToLandingPage = By.className("logo");
	private By viewMyShoppingCartDisplay=By.cssSelector("div.shopping_cart > a");
	private By continueShoppingButton=By.className("cross");

	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	public void addProductToCart(String productName, int quantity) throws Exception {

		By productLink=By.linkText(productName);
		WebElement productLinkElement=this.waitForElementClickable(productLink);
		((JavascriptExecutor) this.getDriver()).executeScript("arguments[0].scrollIntoView(true);", productLinkElement);
		productLinkElement.click();
		WebElement quantityWantedFieldElement=this.waitForElementVisibility(quantityWantedField);
		quantityWantedFieldElement.clear();
		quantityWantedFieldElement.sendKeys(Integer.toString(quantity));
		WebElement addToCartButtonElement=this.waitForElementClickable(addToCartButton);
		addToCartButtonElement.click();
		   Thread.sleep(5000);
		WebElement 	continueShoppingButtonElement=this.waitForElementClickable(continueShoppingButton);
		continueShoppingButtonElement.click();		
		   Thread.sleep(5000);
		this.goToLandingPage();
	}
	
	public void goToLandingPage() throws Exception {
		WebElement goToLandingPageElement=this.waitForElementVisibility(goToLandingPage);
		goToLandingPageElement.click();
		
	}

	public void goToCheckOut() throws Exception {
		WebElement viewMyShoppingCartDisplayElement=this.waitForElementClickable(viewMyShoppingCartDisplay);
		viewMyShoppingCartDisplayElement.click();
		
	}
	
	

}
