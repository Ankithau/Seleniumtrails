import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.virtuoso.qa/free-trial
		
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.virtuoso.qa/free-trial");
		driver.findElement(By.name("name")).sendKeys("Ankitha");
		
		

	}

}
