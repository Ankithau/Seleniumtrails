import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class invoking_new_windowortab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/ch_browser/chromedriver_mac_arm64/chromedriver");
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("---remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set <String> handles=driver.getWindowHandles();
	    Iterator <String> it=handles.iterator();
        String parent=	it.next();
        String child=	it.next();
        driver.switchTo().window(child);
        driver.get("https://rahulshettyacademy.com");
        String coursename=driver.findElements(By.cssSelector("a[href*=\"https://courses.rahulshettyacademy.com/p/\"]")).get(1).getText();
        driver.switchTo().window(parent);
        driver.findElement(By.cssSelector("[name='name']")).sendKeys(coursename);
        driver.close();
        driver.quit();

		
	}

}
