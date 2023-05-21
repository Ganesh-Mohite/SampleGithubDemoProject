

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser implements CommonProperties {

	static WebDriver d;
	public void launchchromebrowser() {
		
	System.out.println("Launching chrome browser successfully");
	System.setProperty(key1, value1);
	d=new ChromeDriver();
	d.manage().window().maximize();
	System.out.println("launched chrome browser successfully");
	d.get(url1);
	System.out.println("URL hitted the chrome successfully ");
		
		
	
	
	
	
		
		
		
		
	}

	
	
	
	
	
	
	
	
}
