import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/ch_browser/chromedriver_mac_arm64/chromedriver");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    System.out.println(driver.getTitle());
		//System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/ch_browser/chromedriver_mac_arm64/chromedriver");
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

	      SoftAssert a =new SoftAssert();

	     

	      for(WebElement link : links)

	      {

	       

	          String url= link.getAttribute("href");

	         

	          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

	          conn.setRequestMethod("HEAD");

	          conn.connect();

	          int respCode = conn.getResponseCode();

	          System.out.println(respCode);

	          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

	      }

	     

	      a.assertAll();

	   
	}




	}



	








	