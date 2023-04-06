import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub https://jqueryui.com/droppable/
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/"); 
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//this switch to frame using index
		driver.switchTo().frame(0);
		
	    Actions A=new Actions(driver);
     	
	    WebElement source=driver.findElement(By.cssSelector("div[id='draggable']"));
	    WebElement target=driver.findElement(By.cssSelector("div[id='droppable']"));
	    //here drags and drops 
	    A.dragAndDrop(source, target).build().perform();
	    //this will come out of frame and u can proceed to perform other actions
	    driver.switchTo().defaultContent();
	
	
		
	}

}
