package Purchase;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Onlinepurchase.ItemSelect;


@Test
public class ItemComp {
	 static WebDriver driver;

	public static void Siteloading() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\Automation\\Geckodriver Latest\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		Thread.sleep(3000);
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		ItemSelect.Search(driver).sendKeys("iPhone XR (64GB) - Yellow");
		ItemSelect.SearchButton(driver).click();
		Thread.sleep(2000);
		String Amazonprice = ItemSelect.Shopping1(driver).getText();
		String amazonPrice = null;
		int item1 = 0;
	    try
	    {
		    amazonPrice = Amazonprice.replaceAll(",","");
	    	item1 = Integer.parseInt(amazonPrice);
	    }
		
		catch(NumberFormatException ex)
		{ 
		  System.out.println(ex);
		  
		}
		System.out.println("Amazon price is " + amazonPrice);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0)); //switches to new tab
	    driver.get("https://www.flipkart.com/");
	    ItemSelect.Productselect(driver).click();
	    ItemSelect.ProductInput(driver).sendKeys("iPhone XR (64GB) - Yellow");
	    ItemSelect.ProductClick(driver).click();
	    Thread.sleep(2000);
	    String Flipkartprice=ItemSelect.Shopping2(driver).getText();
	    String flipkartPrice = null;
	    int item2 = 0;
	    try
	    {
		    flipkartPrice = Flipkartprice.substring(1).replaceAll(",","");
	    	item2 = Integer.parseInt(flipkartPrice);
		} 
	    catch(NumberFormatException ex)
	    
		{ 
			 System.out.println(ex);
			 
		}
    System.out.println("Flipkart price is " +flipkartPrice);
    	if (item1!= 0 && item2!=0) 
    	{
    	    if (item1 > item2) 
    	    {
    	        System.out.println("Flipkartprice is greater than Amazonprice");
    	    } 
    	    else if (item1 < item2) 
    	    {
    	        System.out.println("Amazonprice is lesser than Flipkartprice");
    	    }
        else
           {
           System.out.println("Both prices are equal");
	
	   }
	}
	}
}

