package TripBook;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Review.SelectandReview;

@Test  

public class BookandReview
  {
	
    WebDriver driver;
	public void TripReview() throws InterruptedException, AWTException	
		{
			System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver-v0.21.0-win64\\geckodriver.exe");				Thread.sleep(3000);
			driver = new FirefoxDriver();
			driver.get("https://www.tripadvisor.in/");
			Thread.sleep(3000);	
			
			SelectandReview.Search(driver).click();
			Thread.sleep(3000);
			SelectandReview.SearchClick(driver).sendKeys("ClubMahindra");
			Thread.sleep(2000);
			SelectandReview.Searching(driver).click();
			Thread.sleep(2000);
			
			SelectandReview.SelectHotel(driver).click();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;  //For pagescroll
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(6000);
			
			SelectandReview.Rating(driver).click();
			Actions action = new Actions(driver);  //For mousehovering
			WebElement give_starrating = SelectandReview.Rating(driver);
			action.moveToElement(give_starrating).moveToElement(SelectandReview.StarHover(driver)).click().build().perform();
			SelectandReview.TitleReview(driver).sendKeys("Testtitle");
			SelectandReview.YourReview(driver).sendKeys("Testreview");
			SelectandReview.ServiceRating(driver).click();
			WebElement starrating = SelectandReview.ServiceRating(driver);
			action.moveToElement(starrating).moveToElement(SelectandReview.ServiceRatinghover(driver)).click().build().perform();
			SelectandReview.SubmitReview(driver).click();
			}	
				
	}

