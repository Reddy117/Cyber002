package com.bdd.base;

import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.bdd.repository.OR;


public class BaseClass extends OR{
	
	public static FileInputStream f;
	public static Properties p;
	public static WebDriver driver;
	
	
	public BaseClass() {
		try {
			f=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Config/config.property");
			p=new Properties();
			p.load(f);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initialize(String browser) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}else if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
	}
}
