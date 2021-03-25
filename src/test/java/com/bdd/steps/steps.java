package com.bdd.steps;

import com.bdd.base.BaseClass;
import com.bdd.pages.CompanyPage;
import com.bdd.pages.LandPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps extends BaseClass{
	LandPage lp;
	CompanyPage cp;
	@Given("^User launches \"([^\"]*)\" application$")
	public void user_launches_application(String arg1) throws Throwable {
	 /* System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://ui.cogmento.com/");*/
		initialize(arg1);
	}

	@Given("^User login to the application$")
	public void user_login_to_the_application() throws Throwable {
	   /*driver.findElement(By.xpath(uNamex)).sendKeys("gogi.reddyqa@gmail.com");
	   driver.findElement(By.xpath(passWordx)).sendKeys("anishsaireddy8");
	   driver.findElement(By.xpath(loginBtnx)).click();*/
		lp=new LandPage();
		lp.doLogin();
	}

	@When("^User creates company with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" data$")
	public void user_creates_company_with_and_and_and_and_and_data(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	   /* driver.findElement(By.xpath(Companieslinkx)).click();
	    driver.findElement(By.xpath(newbtnx)).click();
	    driver.findElement(By.xpath(cNamex)).sendKeys(arg1);
	    driver.findElement(By.xpath(cWebx)).sendKeys(arg2);
	    driver.findElement(By.xpath(cAddressx)).sendKeys(arg3);
	    driver.findElement(By.xpath(cityx)).sendKeys(arg4);
	    driver.findElement(By.xpath(statex)).sendKeys(arg5);
	    driver.findElement(By.xpath(zipx)).sendKeys(arg6);
	    driver.findElement(By.xpath(savebtnx)).click();*/
		cp=new CompanyPage();
		cp.createCompany(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^Company should be created using above data$")
	public void company_should_be_created_using_above_data() throws Throwable {
	    
	}
}
