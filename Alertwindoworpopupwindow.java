import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwindoworpopupwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://rahulshettyacademy.com/AutomationPractise/
		String txt="Vishwanath";
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("name")).sendKeys(txt);
		//alert button
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//cancel button
       driver.findElement(By.id("confirmbtn")).click();
       System.out.println(driver.switchTo().alert().getText());
       driver.switchTo().alert().dismiss();
       
		
		
		
		
		
		
		
	}

}
