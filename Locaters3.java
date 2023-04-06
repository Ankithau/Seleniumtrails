import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters3 {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//siblings to siblings 
//child to parent traverse

System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//traverse child to parent
////header/div/button[1]/parent::div
System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}

}
