import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatores_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
         WebDriver driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.id("inputUsername")).sendKeys("Ankitha");
         driver.findElement(By.name("inputPassword")).sendKeys("Ankitha");
         driver.findElement(By.className("signInBtn")).click();
        // System.out.println(driver.getCurrentUrl());
        // System.out.println(p.error
        // driver.wait(5);
         System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
         driver.findElement(By.linkText("Forgot your password?")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ankitha");
        
         driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ankithareddy200@gmail.com");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      //  driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
         driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7090557172");
         driver.findElement(By.className("reset-pwd-btn")).click();
       // driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
     // driver.findElement(By.xpath("//form/button[2]")).click();
       System.out.println(driver.findElement(By.cssSelector("form p")).getText());
       driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
       Thread.sleep(1000);
       driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
       driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
       driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
       driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
       //driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
       
         
	}

}
