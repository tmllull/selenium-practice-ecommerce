package processes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import domain.PurchaseItem;
import screens.CheckOutScreen;
import screens.LandingPage;;

public class PurchaseProcess extends Process {
	
	private List<PurchaseItem> items;

	public PurchaseProcess(WebDriver driver, List<PurchaseItem> items) {
		super(driver);
		this.items=items;
	}

	public void execute() throws Exception {
		LandingPage landingPage = new LandingPage(this.getDriver());
		//add products
		for (PurchaseItem purchaseItem: items) {
			//Go to initial page
			landingPage.goToLandingPage();
			landingPage.addProductToCart(purchaseItem.getProductName(), purchaseItem.getProductQuantity());
		}
		landingPage.goToCheckOut();
		  Thread.sleep(5000);
		CheckOutScreen checkOutPage = new CheckOutScreen(this.getDriver());
		checkOutPage.checkTotalPrice("$72.40");
	}
}
