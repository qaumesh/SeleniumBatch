package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitialiseBrower {

	WebDriver driver=null;
	
	public WebDriver InitialiseBrowser(String brwoserName) {
		if(brwoserName.equals("CHROME")) {
		driver = new ChromeDriver();
		}else if(brwoserName.equals("FIREFOX")) {
		driver = new FirefoxDriver();
		}else {
		driver = new EdgeDriver();
		}
		
		return driver;
	}
}
