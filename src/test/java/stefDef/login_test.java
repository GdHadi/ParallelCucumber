package stefDef;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class login_test {
	
	WebDriver driver;
		
	@Given("^I am the login page$")
	public void i_am_the_login_page(){
	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://qatesting123.wordpress.com/wp-admin/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("^I fill valid user name$")
	public void i_fill_valid_user_name() {
	//loginPage = new login_page();
	//loginPage.I_fill_valid_user_name();
	
	By user_name = By.xpath("//*[@id=\'usernameOrEmail\']");
	driver.findElement(user_name).sendKeys("gdhadi");
	}

	@And("^I click continue button$")
	public void i_click_continue_button() {
	//loginPage = new login_page();
    //loginPage.I_click_continue_button();
	By submitNext_btn = By.xpath("//*[@id=\'primary\']/div/main/div[2]/div[1]/div/form/div[1]/div[2]/button");
	driver.findElement(submitNext_btn).click();
	}

	@And("^I fill valid password$")
	public void i_fill_valid_password() {
	//loginPage = new login_page();	
	//loginPage.If_fill_valid_password();
	By password = By.id("password");
	driver.findElement(password).sendKeys("admin54321");
	}

	@And("^I click login button$")
	public void i_click_login_button(){
	//loginPage = new login_page();		
    //loginPage.I_click_login_button();
	By submitLogin_btn = By.xpath("//*[@id=\'primary\']/div/main/div[2]/div[1]/div/form/div[1]/div[2]/button");
	driver.findElement(submitLogin_btn).click();
	}

	@Then("^I successfully login to dashboard$")
	public void i_successfully_login_to_dashboard() {
	//loginPage = new login_page();
	//loginPage.I_successfully_login_to_dashboard();
	By avatar = By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul[2]/li[2]/a/img");
	Assert.assertTrue(driver.findElement(avatar).isDisplayed());
	
	driver.close();
	}
}
