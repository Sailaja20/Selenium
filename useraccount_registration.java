package liveproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class useraccount_registration extends launchbrowser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useraccount_registration registration = new useraccount_registration();
		registration.gcrlaunchbrowser();
		d1.findElementByLinkText("Online Catalog").click();
		 d1.findElementByLinkText("create an account").click();
		  WebElement gender =d1.findElementByXPath("//div[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]");
		  System.out.println(gender.isDisplayed());
		  System.out.println(gender.isEnabled());
		  System.out.println(gender.isSelected());
		  gender.click();
		  System.out.println(gender.isDisplayed());
		  d1.findElementByName("firstname").sendKeys("abc");
		  d1.findElementByName("lastname").sendKeys("def");
		
		  d1.findElementById("dob").click();
		  
		  Select month = new Select(d1.findElementByClassName("ui-datepicker-month"));
		  month.selectByVisibleText("May");
		  Select year = new Select(d1.findElementByClassName("ui-datepicker-year"));
		  year.selectByVisibleText("1990");
		  Actions date = new Actions(d1);
		  WebElement dob =d1.findElementById("dob");
		  date.moveToElement(dob).build().perform();
		  d1.findElementByLinkText("15").click();
		  d1.findElementByName("email_address").sendKeys("chandar1@yahoo.co.in");
		  d1.findElementByName("company").sendKeys("hsbc");

		  d1.findElementByName("street_address").sendKeys("meadow");
		  d1.findElementByName("suburb").sendKeys("cresent");
		  d1.findElementByName("postcode").sendKeys("2134");
		  d1.findElementByName("city").sendKeys("Brisbane");
		  d1.findElementByName("state").sendKeys("SA");
		  
		  Select country = new Select (d1.findElementByName("country"));
		  country.selectByVisibleText("Australia");
		  d1.findElementByName("telephone").sendKeys("468352897");
		  d1.findElementByName("newsletter").click();

		  
		  d1.findElementByName("password").sendKeys("abc@123");
		  d1.findElementByName("confirmation").sendKeys("abc@123");
		  
		 d1.findElementByClassName("ui-button-text").click();
		 String confirmation= d1.findElementByXPath("//div[@id='bodyContent']/h1").getText();
		 if (confirmation.contains("Your Account Has Been Created"))
		 {
			 System.out.println("Successfull");
		 }
		 else
		 {
			 System.out.println("Unsuccessfull");
		 }
			 
	}

}
