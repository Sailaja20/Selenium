package liveproject;

import org.openqa.selenium.support.ui.Select;

public class UserInterfaceTCs extends launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterfaceTCs UserInterface = new UserInterfaceTCs();
		UserInterface.gcrlaunchbrowser();
		d1.findElementByLinkText("Online Catalog").click();
		d1.findElementByLinkText("My Account").click();
		d1.findElementByName("email_address").sendKeys("sailaja200@gmail.com");
		d1.findElementByName("password").sendKeys("mnb@123");
		d1.findElementById("tdb5").click();
		String url =d1.getCurrentUrl();
		System.out.println(url);
		d1.manage().window().maximize();
		//String category = d1.findElementByCssSelector("Categories").getText();
		//System.out.println(category);
		//category.selectByVisibleText("Appliances");
	}

}
