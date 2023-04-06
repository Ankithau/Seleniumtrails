import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariOptions;

public class sslcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //https://expired.badssl.com/
		//SafariOptions opt =new SafariOptions()
		ChromeOptions opt = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipAddress:8888");
	    opt.setCapability("proxy",proxy);
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("download.default_directory", "/directory/path");
	    opt.setExperimentalOption("prefs", prefs);


		
		opt.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver","/Users/ankithauppet/Documents/chromedriver_mac_arm64/chromedriver");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
