import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reliancesmartapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://foodorigin.com/home");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Webelement =driver.findElements(By.cssSelector("input[class='page-top-search-input']"));
		//driver.findElement(By.xpath("div[@class='nav-popover-box']")).click();
		driver.findElement(By.xpath("//div[@class='nav-popover-box']/a")).click();
		
		
	}

}
