package com.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

public class DealPage extends BaseClass{

	@FindBy(xpath=dealslinkx)
	WebElement dealsLink;
	
	@FindBy(xpath=newbtnx)
	WebElement newbtn;
	
	@FindBy(xpath=dealNamex)
	WebElement dealNameTxt;
	
	
	@FindBy(xpath=dealCompanyX)
	WebElement dealCompanytxt;
	
	@FindBy(xpath=savebtnx)
	WebElement savebtn;
	
	public DealPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createDeal(String dealTitle,String cNamee) {
		try {
			dealsLink.click();
			newbtn.click();
			dealNameTxt.sendKeys(dealTitle);
			dealCompanytxt.sendKeys(cNamee);
			savebtn.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
