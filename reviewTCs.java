package liveproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class reviewTCs extends launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reviewTCs  review = new reviewTCs();
		review.gcrlaunchbrowser();
		review.gcradminlogin();
		d1.findElementByLinkText("Reviews").click();
		d1.findElementByLinkText("Edit").click();
		d1.findElement(By.cssSelector("input[value='1']")).click();;
		WebElement comment =d1.findElement(By.name("reviews_text"));
		comment.clear();
		comment.sendKeys("Testing for ecommerce website.This Mobile is working Great");
		//d1.findElementByXPath("//div[@id='contentText']/table/tbody/tr[6]/td/input[4]").click();
		//d1.findElements(By.name("reviews_rating")).get(4).click();
		List<WebElement> Rating =d1.findElements(By.name("reviews_rating"));
		Rating.get(4).getAttribute("value");
		Rating.get(4).click();
		d1.findElementById("tdb1").click();
		d1.findElementById("tdb1").click();

		//d1.findElementByXPath("//button[@id ='tdb1]/span[2]");
		//review.gcrcloseBrowser();
	}

}
