package com.ruuner;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 }
	public static void loadurl(String url) {
		driver.get(url);
		}
	public void remote() throws MalformedURLException 
	{
		final String USERNAME = "sangeethasree1";
		  final String AUTOMATE_KEY = "QcMcL63rrzaydzZjzsUo";
		  final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		   

			  DesiredCapabilities caps = new DesiredCapabilities();
			    caps.setCapability("browser", "Chrome");
			    caps.setCapability("browser_version", "72.0");
			    caps.setCapability("os", "Windows");
			    caps.setCapability("os_version", "10");
			    caps.setCapability("resolution", "1024x768");
			    caps.setCapability("name", "Adactin");

		    driver = new RemoteWebDriver(new java.net.URL(URL), caps);

	}
	public static void type(WebElement element,String name) {
		element.sendKeys(name);
		}
	public static void btnclick(WebElement element) {
		element.click();
		}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void dropDown(WebElement element,String name) {
		Select s=new Select(element);
		s.selectByVisibleText(name);
	}

	public static String ordernum(WebElement element)
	{
		return element.getAttribute("value");
	}
	}



