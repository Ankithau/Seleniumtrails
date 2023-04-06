import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selelctanotherexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//autosuggestive dropdown
        driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("ind");
       
        Thread.sleep(2000l);
	   //li[class="ui-menu-item"] div
        List<WebElement> obj =driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
        
        
        for(WebElement opt:obj) {
        	if(opt.getText().equalsIgnoreCase("India"))
        			{
        		opt.click();
        		break;
            	
        	}
        	
        	
        }

        
        //count of dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropdown);
        int optionCount = select.getOptions().size();
        System.out.println("The dropdown has " + optionCount + " options.");
        
		
		//dropdwon practice
      // System.out.println(driver.findElements(By.cssSelector("select[id='dropdown-class-example']")).size());
		WebElement option = driver.findElement(By.id("dropdown-class-example"));
		Select abc =new Select(option);
		abc.selectByVisibleText("Option2");

	}

}
