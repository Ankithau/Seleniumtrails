import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Disabledelemnetshandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
	//Radio button 
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	   driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	  System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	    
	    
	   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	   //checking the enabled or disabled using  get attribute method
    if((driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))) {
    	System.out.println("is enabled");
    	Assert.assertTrue(true);
    }
    else {
    	 System.out.println("is disabled");
	    	 Assert.assertFalse(false);
	    }
	   
	
		
		
		//count the no of checkboxes present 
    
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		driver.findElement(By.id("divpaxinfo")).click();
//		
//		
//		Thread.sleep(2000l);
//		
//	for(int i=1;i<6;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			
//		}
//		driver.findElement(By.id("hrefDecAdt")).click();
//	
//	 driver.findElement(By.id("btnclosepaxoption")).click();
//}
	


	}
	}

