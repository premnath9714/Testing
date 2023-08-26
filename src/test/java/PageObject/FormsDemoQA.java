package PageObject;


	
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class FormsDemoQA {
		
		WebDriver driver;

		public FormsDemoQA(WebDriver Driver)
		{
			driver=Driver;

			PageFactory.initElements(Driver, this);
		}
		
		@FindBy(xpath="//h5[text()='Forms']")
		private WebElement formsTab;
		
		@FindBy(xpath="//span[text()='Practice Form']")
		private WebElement PracticeFormitem;

		@FindBy(id="firstName")
		private WebElement firstName ;
		
		@FindBy(id="lastName")
		private WebElement lastName ;
		
		@FindBy(id="userEmail")
		private WebElement userEmail ;
		
		@FindBy(xpath="//label[@for='gender-radio-1']")
		private WebElement maleradiobtn ;
		
		@FindBy(id="userNumber")
		private WebElement mobilenumber ;
		
		@FindBy(id="dateOfBirthInput")
		private WebElement dob ;
		
		@FindBy(xpath="(//div[contains(@class,'subjects-auto-complete')])[2]")
		private WebElement subjects ;

		@FindBy(xpath="	//label[@for='hobbies-checkbox-1']")
		private WebElement sportcheckbox ;
		
		@FindBy(id="currentAddress")
		private WebElement currentAddress ;
		
		@FindBy(xpath="(//div[text()='NCR'])[2]")
		private WebElement state ;
		
		@FindBy(xpath="//div[text()='Delhi']")
		private WebElement city ;
		
		@FindBy(id="submit")
		private WebElement submitbtn ;
		
		@FindBy(xpath="//h5")
		private WebElement heading ;
		
		@FindBy(id="example-modal-sizes-title-lg")
		private WebElement message ;
		
		
		public String headingtext() {
			String actual=heading.getText();
			return actual;
		}
		
		public void clickonformtab() {
			formsTab.click();
		}
		
		public void clickonpracticeformtab() {
			PracticeFormitem.click();
		}
		
		public void enterfirstname(String firstname) {
			firstName.sendKeys(firstname);
		}
		
		public void enterlastname(String lastname) {
			lastName.sendKeys(lastname);
		}
		
		public void enteremail(String email) {
			userEmail.sendKeys(email);
		}
		
		public void clickonmaleradiobtn() {
			maleradiobtn.click();
		}
		
		public void entermobilenumber(String mobileno) {
			mobilenumber.sendKeys(mobileno);
		}
		
		public void enterdateofbirth(String dobs) {
			dob.sendKeys(dobs);
		}
		
		public void entersubject(String subject) {
			subjects.sendKeys(subject);
		}
		
		public void clickoncheckbox() {
			sportcheckbox.click();
		}
		
		public void enterCurrentAddress(String address) {
			currentAddress.sendKeys(address);
		}
		
		public void selectstate() {
			state.click();
		}
		
		public void selectcity() {
			city.click();
		}
		
		public void clickonsubmitbtn() {
			submitbtn.click();
		}
		
		public String verification() {
			String actual=message.getText();
			return actual;
			
		}
		
	}



