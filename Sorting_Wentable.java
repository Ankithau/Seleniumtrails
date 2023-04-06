import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Sorting_Wentable{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/ch_browser/chromedriver_mac_arm64/chromedriver");
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("---remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click to sort th elemnet in table 
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all webelements into list 
		List <WebElement>listelements =driver.findElements(By.xpath("//tr/td[1]"));
		//System.out.println();
		//get all the text in to new original list
		List<String> original=listelements.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(original);
		//sort the oroginal list of step 3
	    List <String> sortedlist=original.stream().sorted().collect(Collectors.toList());
	    System.out.println(sortedlist);
	    List<String>price;
		//compare sorted list vs original list
	  
	    Assert.assertEquals(original, sortedlist);	
	    //get the price of beans in a table 
	do {
	
		List <WebElement>nextrows =driver.findElements(By.xpath("//tr/td[1]"));
		price= nextrows.stream().filter(s->s.getText().contains("")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
	    price.forEach(a->System.out.println(a));
	
	 price.forEach(a->System.out.println(a));
	    if(price.size()<1) 
	    {
	    	driver.findElement(By.cssSelector("[aria-label$='Next']")).click();
	    }

	    }while(price.size()<1);
	}



	private static String getPriceVeggie(WebElement s ) {
		// TODO Auto-generated method stub
	String priceValue=	s.findElement(By.xpath("following-sibling::td[1]")).getText();
	String discount =s.findElement(By.xpath("following-sibling::td[2]")).getText();
	
		return priceValue ;
		
	}
}
