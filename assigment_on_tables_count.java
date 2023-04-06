import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment_on_tables_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.path2usa.com/travel-companions");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		//secound row #product tr:nth-child(3)
	WebElement table=driver.findElement(By.id("product"));
	System.out.println(table.findElements(By.tagName("tr")).size());
	System.out.println(table.findElements(By.tagName("th")).size());
	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	List<WebElement> secoundrow =table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//System.out.println(secoundrow);
	System.out.println(secoundrow.get(0).getText());
	System.out.println(secoundrow.get(1).getText());
	System.out.println(secoundrow.get(2).getText());
		
		
	}

}
