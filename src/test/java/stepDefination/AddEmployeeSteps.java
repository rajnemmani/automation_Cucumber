package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps {
	WebDriver driver;
	String Expected;
	String Actual;
	
	@Given("^User navigates url as \"([^\"]*)\" in a browser$")
	public void launchUrl(String url) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("^user logs as \"([^\"]*)\" in username$")
	public void enterUser(String user) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(user);
	    
	}

	@When("^user logs as \"([^\"]*)\" in password$")
	public void enterPass(String pass) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
	    
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	    Thread.sleep(4000);
	}

	@Then("^user login success$")
	public void validateLogin() throws Throwable {
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("Login Success::"+Expected+"    "+Actual);
		}
		else {
			System.out.println("Login Fail::"+Expected+"    "+Actual);
		}
	}

	@When("^user clicks PIM$")
	public void user_clicks_PIM() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Thread.sleep(1000);
	    
	}

	@When("^user click Add button$")
	public void user_click_Add_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		Thread.sleep(1000);
	}

	@When("^user enter as \"([^\"]*)\" in frame$")
	public void enterFrame(String FirstName) throws Throwable {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("FirstName");
	    
	}

	@When("^user enter as \"([^\"]*)\" in mname$")
	public void enterMname(String MiddleName) throws Throwable {
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("MiddleName");
	    
	}

	@When("^user enter as \"([^\"]*)\" in lname$")
	public void enterLname(String LastName) throws Throwable {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("LastName");
	    
	}

	@When("^user capture Eid before adding$")
	public void user_capture_Eid_before_adding() throws Throwable {
	    Expected = driver.findElement(By.name("employeeId")).getAttribute("value");
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	    
	}

	@When("^user capture Eid after adding$")
	public void user_capture_Eid_after_adding() throws Throwable {
		Actual = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).getAttribute("value");
	    
	}

	@Then("^user validates Eid$")
	public void user_validates_Eid() throws Throwable {
		if(Expected.equals(Actual))
		{
			System.out.println("Add Employee is Success::"+Expected+"   "+Actual);
		}
		else 
		{
			System.out.println("Add Employee is Fail::"+Expected+"   "+Actual);
		}
	    
	}

	@Then("^user close Browser$")
	public void user_close_Browser() throws Throwable {
		driver.quit();
	    
	}


}
