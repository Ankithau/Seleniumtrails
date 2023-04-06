import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.path2usa.com/travel-companions");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1100)");
Thread.sleep(2000);
WebElement Date =driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']"));
Date.click();
while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("May")) {
	Thread.sleep(3000);
	//driver.findElement(By.cssSelector("[class='flatpickr-month'] span[class='flatpickr-next-month']")).click();
	//driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-next-month']")).click();
	driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
	
	//driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
	 

}
List<WebElement>dates=driver.findElements(By.cssSelector(".flatpickr-day"));
//System.out.println("dates");
int count =driver.findElements(By.cssSelector(".flatpickr-day")).size();
//System.out.println(driver.findElement(By.cssSelector(".flatpickr-month")).getText());
 for(int i=0;i<count;i++){
	 Thread.sleep(2000);
	 String text= driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();
	 //System.out.println(text);
  
	if(text.equalsIgnoreCase("23")) {
		
		driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
		System.out.println("The select day is:"+text);
		break;
	}

}
 String date = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).getAttribute("value");
	System.out.println("The select date is:"+date);

 


	 
 }

}

