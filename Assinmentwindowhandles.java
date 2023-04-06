import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinmentwindowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> wind =driver.getWindowHandles();//parent.child
		Iterator <String> it=wind.iterator();
		String parent =it.next();
		driver.switchTo().window(it.next());
	    System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	    driver.switchTo().window(parent);
	    System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	
	}

}
