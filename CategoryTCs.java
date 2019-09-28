package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CategoryTCs extends launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryTCs  Category = new CategoryTCs();
		Category.gcrlaunchbrowser();
		Category.gcradminlogin();
		d1.findElementByLinkText("Categories/Products").click();
		d1.findElementByLinkText("New Category").click();
		d1.findElementByName("categories_name[1]").sendKeys("Clothes");
		d1.findElementByName("categories_image").sendKeys("C:\\Users\\Bala\\Desktop\\india\\traditional-dress-for-mens.jpg");
		d1.findElementById("tdb3").click();
		Category.gcrcloseBrowser();
	
		
		
		
	}

}
