package liveproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductTCs extends launchbrowser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductTCs  Products = new ProductTCs();
		Products.gcrlaunchbrowser();
		Products.gcradminlogin();
		d1.findElementByLinkText("Categories/Products").click();
		d1.findElementByLinkText("New Product").click();
		boolean stock1 =d1.findElementByXPath("//div[@id=\"contentText\"]/form/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/input[1]").isSelected();
		System.out.println(stock1);
		d1.findElementById("products_date_available").click();
		List<WebElement> alldate = d1.findElements(By.className("ui-state-default"));
		for(WebElement day:alldate)
		{
			String date=day.getText();
			
			if(date.equalsIgnoreCase("8"))
			{
				day.click();
				break;
			}
		}
		Select product_manufacturer = new Select(d1.findElementByName("manufacturers_id"));
		product_manufacturer.selectByVisibleText("HP");
		d1.findElementByName("products_name[1]").sendKeys("Cannon");
		Select taxclass = new Select(d1.findElementByName("products_tax_class_id"));
		taxclass.selectByIndex(1);
		d1.findElementByName("products_price").sendKeys("5000");
		d1.findElementByName("products_price_gross").sendKeys("4000");
		d1.findElementByName("products_description[1]").sendKeys("It's good product");
		d1.findElementByName("products_quantity").sendKeys("10");
		d1.findElementByName("products_model").sendKeys("M5000");
		d1.findElementByName("products_image").sendKeys("C:\\Users\\Bala\\Desktop\\india\\traditional-dress-for-mens.jpg");
		d1.findElementByName("products_weight").sendKeys("100gm"); 
		d1.findElementById("tdb1").click();
		
		System.out.println("Product successfully Added");
		//Products.gcrcloseBrowser();
	}

}
