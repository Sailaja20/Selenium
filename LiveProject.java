package liveproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LiveProject {

public static ChromeDriver d1;

		
		@Test
		public void LaunchBrowser ()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\eclipse-workspace\\Selenium1\\Drivers\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();
		d1.get("http://www.gcrit.com/build3/admin/");
		System.out.println(d1.getTitle());
		d1.findElement(By.name("username")).sendKeys("admin");
		d1.findElement(By.name("password")).sendKeys("admin@123");
		d1.findElement(By.id("tdb1")).click();
		String loginurl = d1.getCurrentUrl();
		System.out.println(loginurl);
		
						
		if (loginurl.equals("http://www.gcrit.com/build3/admin/index.php"))
		{System.out.println("Admin Login Successful");}
		
		else
			{System.out.println("Admin Login UnSuccessful");	}
		
	
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Waited and Closed");
		d1.close();
			
		}
		}
		


