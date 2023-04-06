import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("vishwa");
		driver.findElement(By.name("email")).sendKeys("vishmeluck@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement li =driver.findElement(By.id("exampleFormControlSelect1"));
        Select abc = new Select(li);
        abc.selectByVisibleText("Male");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[type='date']")).sendKeys("03/07/2023");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
       System.out.println( driver.findElement(By.cssSelector("div[class*='alert-dismissible']")).getText());
        
	}

}
