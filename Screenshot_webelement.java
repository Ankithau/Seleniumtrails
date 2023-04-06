import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot_webelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/ch_browser/chromedriver_mac_arm64/chromedriver");
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("---remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set <String> handles=driver.getWindowHandles();
	    Iterator <String> it=handles.iterator();
        String parent=	it.next();
        String child=	it.next();
        driver.switchTo().window(child);
        driver.get("https://rahulshettyacademy.com");
        String coursename=driver.findElements(By.cssSelector("a[href*=\"https://courses.rahulshettyacademy.com/p/\"]")).get(1).getText();
        driver.switchTo().window(parent);
       WebElement name= driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(coursename);
        File srcfile= name.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(srcfile, new File("./Users/ankithauppet/eclipse-workspace/Intoduction/target/ takeweb.jpg"));
        
       
        
       // driver.close();
        driver.quit();

		

	}

}
