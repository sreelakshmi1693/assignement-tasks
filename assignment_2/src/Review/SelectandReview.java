package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class SelectandReview
{
private static WebElement element = null;

public static WebElement Search(WebDriver driver) 
{
    element = driver.findElement(By.xpath("//div[@class='ui_pill brand-trip-search-geopill-TripSearchGeoPill__pill--2CF8h']")); 
    return element;	
}

public static WebElement SearchClick(WebDriver driver)
{
   element = driver.findElement(By.className("Smftgery"));
   return element;
}

public static WebElement Searching(WebDriver driver)
{
   element = driver.findElement(By.xpath("//span[@class='common-typeahead-results-BasicResult__resultTitle--1TQbu common-typeahead-results-BasicResult__rescueResult--1h3jO']"));
   return element;
}

public static WebElement SelectHotel(WebDriver driver)
{
   element = driver.findElement(By.className("result-title"));
   return element;
}
public static WebElement HotelReview(WebDriver driver)
{
   element = driver.findElement(By.xpath("//a[@class='ui_button primary']"));
   return element;
}

public static WebElement Rating(WebDriver driver)
{
	element = driver.findElement(By.id("overallRatingFlagText"));
	return element;
}
public static WebElement StarHover(WebDriver driver)
{
	element = driver.findElement(By.id("bubble_rating"));
	return element;
}
public static WebElement TitleReview(WebDriver driver)
{
	element = driver.findElement(By.xpath("//input[@id='ReviewTitle']"));
	return element;
}
public static WebElement YourReview(WebDriver driver)
{
	element = driver.findElement(By.id("ReviewText"));
	return element;
}
public static WebElement ServiceRating(WebDriver driver)
{
	element = driver.findElement(By.id("AMENITY_RATING_BUBBLE_TEXT_qid12"));
	return element;
}
public static WebElement ServiceRatinghover(WebDriver driver)
{
	element = driver.findElement(By.id("qid12_bubbles"));
	return element;
}
public static WebElement SubmitReview(WebDriver driver)
{
	element = driver.findElement(By.id("SUBMIT"));
	return element;
}
}
