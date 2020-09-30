package goibibo_stepDefenitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wiproassignment.goibibo_Base.TestBase;
import wiproassignment.goibibo_Pages.HomePage;

public class HomepageSteps extends TestBase {

	WebElement element;
	Logger log = Logger.getLogger(HomepageSteps.class);
	HomePage HomPge;
	//WebDriver newdriver;
	public HomepageSteps() throws IOException {
		super(driver);
	
	}

	@Given("^user launches the browser$")
	public void user_launches_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		driverIntialization();

		
	}

	@Then("^user enters the url\"([^\"]*)\"$")
	public void user_enters_the_url(String urls) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		launchUrl(urls);
		
	}

	@Then("^user verify the homepagetitle$")
	public void user_verify_the_homepagetitle() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomPge =new HomePage();
		HomPge.homePageTitle();
		
	}

	@Then("^user select the airtrip$")
	public void user_select_the_airtrip() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomPge.airwaysTrip();
		
		
	}

	@Then("^user must provide the\"([^\"]*)\"and\"([^\"]*)\"$")
	public void user_must_provide_the_and(String source, String destination) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		HomPge.travelDetailsFill(source, destination);
	}

	@Then("^user must select the\"([^\"]*)\"$")
	public void user_must_select_the(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^user enter the passenger count\"([^\"]*)\"$")
	public void user_enter_the_passenger_count(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^user search the air availability$")
	public void user_search_the_air_availability() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

}
