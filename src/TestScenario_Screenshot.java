

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class TestScenario_Screenshot extends LaunchingBrowser  {

	public void s1() throws IOException {
		
		d.navigate().to(url1);

		String path = "D:\\Velocity\\upscpage.png";
		
		File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File destination=new File(path);
		
		FileHandler.copy(source, destination);
		
		
		
	}
	
	public void s2() throws IOException {
		
		d.navigate().to("https://www.amazon.in/Books-Login/s?rh=n%3A976389031%2Cp_27%3ALogin");
		
		String path1 = "D:\\Velocity\\amazonpage.png";
		
		File source1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File destination1=new File(path1);
		
		FileHandler.copy(source1, destination1);
		
		
		
	}
	
	public void s3() throws IOException {
		
		d.navigate().to("https://affiliate.flipkart.com/login");
		
		String path2 = "D:\\Velocity\\flipkartpage.png";
		
		File source2 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File destination2=new File(path2 );
		
		FileHandler.copy(source2, destination2);
		
	}
	
	
	public void s4() throws IOException {
		
		d.navigate().to("https://twitter.com/i/flow/login");
		
		String path3 = "D:\\Velocity\\twitterpage.png";
		
		
		File source3 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File destination3=new 	File(path3);		
		
		FileHandler.copy(source3, destination3);
	}
	
	
	public void s5() throws IOException {
		
		d.navigate().to("https://www.quora.com/");
		
		String path4 = "D:\\Velocity\\quorapage.png";
		
		File source4 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File destination4=new File( path4);		
		
		FileHandler.copy(source4, destination4);
		
	}
	 
	
	
	
}
