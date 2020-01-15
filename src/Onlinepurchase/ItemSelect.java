package Onlinepurchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class ItemSelect {
	
	private static WebElement element = null;

	public static WebElement Search(WebDriver driver) {
		
	    element = driver.findElement(By.id("twotabsearchtextbox")); 
	    return element;	
	}
	public static WebElement SearchButton(WebDriver driver) {
	    element =driver.findElement(By.cssSelector(".nav-search-submit > input:nth-child(2)"));
	    return element;
	}
	public static WebElement Shopping1(WebDriver driver) {
	    element =driver.findElement(By.className("a-price-whole"));
	    return element;
	}
	
	public static WebElement Productselect(WebDriver driver) {
	    element =driver.findElement(By.cssSelector("body.fk-modal-visible:nth-child(2) div.mCRfo9:nth-child(8) div._2ISNhP._3AOFWO div._3Njdz7 > button._2AkmmA._29YdH8"));
	    return element;
	}
	public static WebElement ProductInput(WebDriver driver) {
	    element =driver.findElement(By.cssSelector("div._3ybBIU div._1tz-RS div._3pNZKl:nth-child(2) div.Y5-ZPI:nth-child(2) form._1WMLwI.header-form-search div.col-12-12._2tVp4j:nth-child(1) div.O8ZS_U:nth-child(1) > input.LM6RPg"));
	    return element;
	}
	
	public static WebElement ProductClick(WebDriver driver) {
	    element =driver.findElement(By.cssSelector("div._3ybBIU div._1tz-RS div._3pNZKl:nth-child(2) div.Y5-ZPI:nth-child(2) form._1WMLwI.header-form-search div.col-12-12._2tVp4j:nth-child(1) > button.vh79eN:nth-child(2)"));
	    return element;
	}
	public static WebElement Shopping2(WebDriver driver) {
	    element =driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div/div/div"));
	    return element;
	}
}