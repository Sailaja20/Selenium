package liveproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay_Testing {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\eclipse-workspace\\Selenium1\\Drivers\\chromedriver.exe"); 
		  ChromeDriver d1 = new ChromeDriver();
			d1.get("https://www.ebay.com.au/");
			System.out.println(d1.getCurrentUrl());
			/*d1.findElementByLinkText("Sign in").click();
			d1.findElementById("userid").sendKeys("ushasailaja20@gmail.com");
			d1.findElementById("pass").sendKeys("lakshmi@20");
			d1.findElementById("sgnBt").click();
			String loginname =d1.findElementById("gh-ug").getText();
			System.out.println(loginname);*/
			/*if (loginname.contains("sailaja"))
			{
				System.out.println("Login Successful");
				
			}
			else
			{
				System.out.println("Login unSuccessful");
	
			}*/
			d1.findElementByLinkText("Electronics").click();
			//d1.manage().window().maximize();
			d1.findElementByLinkText("Phones, Smart Watches & Accessories").click();;
			//d1.findElementByLinkText("Cameras").click();;
			d1.findElementByXPath("//li[@id='w1-w0-w1']/button").click();
			d1.manage().window().maximize();
			d1.findElementByLinkText("Mobile Phone Cases, Covers & Skins").click();
			d1.findElementByLinkText("Samsung").click();
			d1.findElementByLinkText("Wallet Case").click();
			d1.manage().window().maximize();
			d1.findElementByLinkText("Luxury Genuine Real Leather Flip Case Wallet Cover For Samsung Galaxy lot FL").click();
			Select option = new Select (d1.findElementByName("Option"));
			option.selectByVisibleText("black For Samsung A5");
			//d1.findElementByClassName("qtyInput").sendKeys("2");
			d1.findElementById("isCartBtn_btn").click();
			d1.findElementByLinkText("Remove").click();
			//d1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//d1.close();
	}

}
