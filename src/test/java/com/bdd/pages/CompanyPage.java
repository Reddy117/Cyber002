package com.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

public class CompanyPage extends BaseClass{

	@FindBy(xpath=Companieslinkx)
	WebElement companylink;
	
	@FindBy(xpath=newbtnx)
	WebElement newbtn;
	
	@FindBy(xpath=cNamex)
	WebElement cName;
	
	@FindBy(xpath=cWebx)
	WebElement cWeb;
	
	@FindBy(xpath=cAddressx)
	WebElement cAddress;
	
	@FindBy(xpath=cityx)
	WebElement city;
	
	@FindBy(xpath=statex)
	WebElement state;
	
	@FindBy(xpath=zipx)
	WebElement zip;
	
	@FindBy(xpath=savebtnx)
	WebElement savebtn;
	
	public CompanyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createCompany(String comName,String comWeb,String comAddress,String comCity,String comState,String comZip)
	{
		try {
			companylink.click();
			newbtn.click();
			cName.sendKeys(comName);
			cWeb.sendKeys(comWeb);
			cAddress.sendKeys(comAddress);
			city.sendKeys(comCity);
			state.sendKeys(comState);
			zip.sendKeys(comZip);
			savebtn.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
