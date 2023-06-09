import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locatars2 {
	
	public static String getpass(WebDriver driver) throws InterruptedException {
		
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.className("reset-pwd-btn")).click();
	     String paswordText =driver.findElement(By.cssSelector("form p")).getText();
	     //Please use temporary password 'rahulshettyacademy' to Login.
	     String [] passarray=paswordText.split("'");
	   //0th index left side it will split Please use temporary password '
	  //1st  rahulshettyacademy' to Login
	    
	     String password=passarray[1].split("'")[0];
	     return password;
	     
	 
	     
	    
	   
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="rahul";
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getpass(driver);
		
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
       System.out.println( driver.findElement(By.tagName("p")).getText());
       Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
       Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+ name+",");
       driver.findElement(By.xpath("//button[text()='Log Out']")).click();
      
       driver.close();
      
       }

}
