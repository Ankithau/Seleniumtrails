import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class ScrollingTechniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.path2usa.com/travel-companions");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
	List<WebElement> totalcolumns=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int sum=0;
	for(int i=-0;i<totalcolumns.size();i++) {
		Integer.parseInt(totalcolumns.get(i).getText());
		sum=sum+Integer.parseInt(totalcolumns.get(i).getText());
		
	}
	System.out.println(sum);
	driver.findElement(By.cssSelector(".totalAmount")).getText();
	int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	
	
	}

}
