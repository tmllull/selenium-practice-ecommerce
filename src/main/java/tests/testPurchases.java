package tests;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import domain.PurchaseItem;
import processes.PurchaseProcess;
import utils.Configuration;

public class testPurchases {

	static Configuration config;
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		config=new Configuration();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		driver=config.initializeTestingEnvironment();
		driver.get("http://automationpractice.com");
	}

	@After
	public void tearDown() throws Exception {
		config.closeTestingEnvironment();
	}

	@Test
	public void test() throws Exception {
		List<PurchaseItem> items=new LinkedList();
		items.add(new PurchaseItem("Blouse",2));
		items.add(new PurchaseItem("Printed Chiffon Dress",1));
		PurchaseProcess purchase=new PurchaseProcess(driver,items);
		purchase.execute();
		Thread.sleep(5000);
		
	}

}
