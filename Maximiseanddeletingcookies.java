import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximiseanddeletingcookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/ch_browser/chromedriver_mac_arm64/chromedriver");
		//WebDriverManager
		
		//ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.get("https://www.google.com/");
		
	// /Users/ankithauppet/Documents/Shared 
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/ch_browser/chromedriver_mac_arm64/chromedriver");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		

		
	}

}
