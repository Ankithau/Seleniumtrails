import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Countoflinksarescope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//https://www.rahulshettyacademy.com/AutomationPractice/
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		/*
		 * //this will give no. of links in the page
		 * System.out.println(driver.findElements(By.tagName("a")).size()); //this will
		 * give num of links present in the footer and limitimg the scope
		 * 
		 * WebElement footerlinkdriver =driver.findElement(By.id("gf-BIG"));
		 * System.out.println(footerlinkdriver.findElements(By.tagName("a")).size());
		 * //this will give count of links are available in the footer in particular
		 * column WebElement colomnlinks =
		 * footerlinkdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		 * System.out.println(colomnlinks.findElements(By.tagName("a")).size());
		 * 
		 * //here we click each links in a and getsopen in a separate tab for(int
		 * i=1;i<colomnlinks.findElements(By.tagName("a")).size();i++) { String
		 * eachtabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 * 
		 * colomnlinks.findElements(By.tagName("a")).get(i).sendKeys(eachtabs);
		 * Thread.sleep(5000l);
		 * 
		 * }
		 */
		driver.manage().window().maximize();
		Thread.sleep(5000);
	    //WebDriverWait wait = new WebDriverWait(driver, 5);
	    System.out.println(driver.findElements(By.tagName("a")).size());//gives total links present on page
	    WebElement footerLink = driver.findElement(By.cssSelector("div[id='gf-BIG']"));
	    System.out.println(footerLink.findElements(By.tagName("a")).size());
	    WebElement columnLink=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
	    System.out.println(columnLink.findElements(By.tagName("a")).size());
	    for(int i=1;i<columnLink.findElements(By.tagName("a")).size();i++)
	    {
	    	
	    String clickonlinkTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
	    
	    columnLink.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
	    Thread.sleep(5000);    
	    }
	    Set<String> countwindow = driver.getWindowHandles();
	    Iterator<String> it=countwindow.iterator();
	    while(it.hasNext()){
	    driver.switchTo().window(it.next());
	    System.out.println(driver.getTitle());
	    driver.navigate().back();
	    }    
	}
	   
	   
	
		

	

	}

