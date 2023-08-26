package StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.FormsDemoQA;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQAForms {
	public WebDriver driver;
	public FormsDemoQA FormsDemoQApage;
	 
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);
	   
	}

	@When("User click on Forms Menu")
	public void user_click_on_forms_menu() {
		FormsDemoQApage=new FormsDemoQA(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		FormsDemoQApage.clickonformtab();
	}

	@When("User click on Practice Form Under Form Menu")
	public void user_click_on_practice_form_under_form_menu() {
		FormsDemoQApage.clickonpracticeformtab();
	}

	@Then("Page heading should be {string}")
	public void page_heading_should_be(String expectedheading) {
		String actualheading=FormsDemoQApage.headingtext();
		if(actualheading.equals(expectedheading)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	
	}

	@When("User fill Student Registration Form and click on Submit Button")
	public void user_fill_student_registration_form_and_click_on_submit_button() throws Exception {
		FormsDemoQApage.enterfirstname("Premnath");
		FormsDemoQApage.enterlastname("Suryawanshi");
		FormsDemoQApage.enteremail("premnath1497@gmail.com");
		FormsDemoQApage.clickonmaleradiobtn();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		//FormsDemoQApage.enterdateofbirth("1 Sept 1997");
		//FormsDemoQApage.entersubject("Automation");
		FormsDemoQApage.entermobilenumber("8381067443");
		FormsDemoQApage.enterCurrentAddress("Pimple Gurav");
		FormsDemoQApage.clickoncheckbox();
		Thread.sleep(7000);
		FormsDemoQApage.selectstate();
		FormsDemoQApage.selectcity();
		FormsDemoQApage.clickonsubmitbtn();
	}

	@Then("User can see message {string}")
	public void user_can_see_message(String expectedresult) {
		String actualresult=FormsDemoQApage.verification();
		if(expectedresult.equals(actualresult)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}

	@Then("close browser")
	public void close_browser() {
	  driver.close();
	}

}
