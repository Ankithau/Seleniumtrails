import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsmouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions cursorr = new Actions(driver);
		//a[id='nav-link-accountList']
		
		//input[id='twotabsearchtextbox']
		//selects hello keword from search box
		cursorr.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).keyDown(Keys.SHIFT).click().sendKeys("hello").doubleClick().build().perform();
		//this moves to specific element
		cursorr.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
		

	}

}
