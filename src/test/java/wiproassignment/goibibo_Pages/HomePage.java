package wiproassignment.goibibo_Pages;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wiproassignment.goibibo_Base.TestBase;
import wiproassignment.goibibo_DropdownHelper.DropdownHelper;

public class HomePage extends TestBase {
	
	String expectedTitle = "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off";
	Logger log = Logger.getLogger(HomePage.class);
	boolean status;
	DropdownHelper drpHelper;
	Actions act;
	
	public HomePage() throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}

	

	@FindBy(id="oneway")
	WebElement oneWay;
	
	@FindBy(id="gosuggest_inputSrc")
	WebElement gatewayFrom;
	
	@FindBy(id="gosuggest_inputDest")
	WebElement gatewayTo;
	
	@FindBy(id="react-autosuggest-1")
	WebElement autoSugessionList;
	
	
	

	public void homePageTitle() {
		
		String actualTitle =getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Validated Landing page Title:-  "+actualTitle);
		Assert.assertTrue("Validated Landing page Title ", true);
		log.info("Validated Landing page Title");
		
		
	}
	
	public void airwaysTrip() {
		status = clickWebelement(oneWay);
		System.out.println("airways selected  :- "+status);
		log.info("airways selected ");
		
		
	}
	
	public void travelDetailsFill(String deprtSource, String destination) throws IOException {
		
		findElementAndFillText(gatewayFrom, deprtSource);
		//drpHelper = new DropdownHelper(driver);
		act = new Actions(driver);
		act.keyDown(gatewayFrom,Keys.DOWN).perform();
		findElementAndFillText(gatewayTo, destination);
		
		
	}
	
	
	
}
