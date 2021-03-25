package com.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

public class LandPage extends BaseClass{

	@FindBy(xpath=uNamex)
	WebElement uNameText;
	
	@FindBy(xpath=passWordx)
	WebElement pWordText;
	
	@FindBy(xpath=loginBtnx)
	WebElement loginBtn;
	
	public LandPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin() {
		try {
			uNameText.sendKeys(p.getProperty("uName"));
			pWordText.sendKeys(p.getProperty("passWord"));
			loginBtn.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
