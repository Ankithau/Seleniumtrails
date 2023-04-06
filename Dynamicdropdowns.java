import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value=\"DEL\"]")).click();
       //Thread.sleep(2000);
      // driver.findElement(By.xpath("(//a[@value='PNY'])[2]")).click();
       driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value='DEL']")).click();
      Thread.sleep(2000);
       //driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value='MAA']")).click();
       driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
       ////div[@id="glsctl00_mainContent_ddl_destinationStation1_CTNR"] //a[@value='MAA']
       driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date1\"]")).click();
	}

}
