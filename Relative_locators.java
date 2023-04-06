import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Relative_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/ch_browser/chromedriver_mac_arm64/chromedriver");
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("---remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	WebElement nameofeditbox	=driver.findElement(By.cssSelector("[css='1']"));
	//driver.findElement(with(By.tagName("label")).above(nameofeditbox)).getText()
//	System.out.println(driver.findElement(with(By.tagName("label")).above(nameofeditbox)).getText());


	}

	private static By with(By tagName) {
		// TODO Auto-generated method stub
		return null;
	}

}
