package liveproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

public static ChromeDriver d1 ;
	

	public void gcrlaunchbrowser()
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\eclipse-workspace\\Selenium1\\Drivers\\chromedriver.exe"); 
		  d1 = new ChromeDriver();
			d1.get("http://www.gcrit.com/build3/admin");
			System.out.println(d1.getCurrentUrl());

	}
	
	public void gcrcloseBrowser()
	{
		/*if(!d1.toString().contains("null")) */
		d1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("Browser Waited and Closed");
		d1.close();
		System.out.println("Logout Successful");
		
			}

public void gcradminlogin()
{
	d1.findElement(By.name("username")).sendKeys("admin");
	d1.findElement(By.name("password")).sendKeys("admin@123");
	d1.findElement(By.id("tdb1")).click();
	System.out.println(d1.getCurrentUrl());
	System.out.println("Login Successful");
}
	
}
