import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartexample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j=0;
		String[] itemstoclick = {"Cucumber","Tomato"};
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		//WebDriverWait w =new WebDriverWait(driver,5);


		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	
		Thread.sleep(3000);
		AddItems(driver,itemstoclick);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
	}
	public static  void AddItems(WebDriver driver,String[]itemstoclick)

	{
		int j=0;
		List<WebElement> prod=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<prod.size();i++) 
		{
			//Brocolli - 1 Kg

			//Brocolli,    1 kg
	     String[] name=prod.get(i).getText().split("-");
	    String Splittedresult =name[0].trim();
	  //format it to get actual vegetable name

	  //convert array into array list for easy search

	  //  check whether name you extracted is present in arrayList or not-
	     
	       List listofitems =Arrays.asList(itemstoclick);
	     
			if(listofitems.contains(Splittedresult)) {
				
				//click on Add to cart
				//++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			 
				if(j==itemstoclick.length) {
					j++;
					break;
					
				}
			}
	  
	}
		
		
		

	}



}


