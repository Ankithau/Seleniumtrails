import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentLoginpage {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input[id='username']
		String[] mbnames= {"Blackberry",""};
		
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(7000));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		//input[id='password']
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		 WebElement opt=driver.findElement(By.xpath("//select[@class='form-control']"));
		 Select dropdown=new Select(opt);
		 dropdown.selectByValue("consult"); 
		 driver.findElement(By.cssSelector("#terms")).click();
		 driver.findElement(By.cssSelector("#signInBtn")).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
	List<WebElement> Addbuttons= driver.findElements(By.cssSelector(".card-footer .btn-info"));
	//List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
for(int i=0;i<Addbuttons.size();i++) {
	Addbuttons.get(i).click();
}
//driver.findElement(By.partialLinkText("Checkout")).click();
driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		

	}
}


