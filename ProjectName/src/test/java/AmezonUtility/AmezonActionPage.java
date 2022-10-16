package AmezonUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class AmezonActionPage {

	public static WebDriver driver;
	static public void captureScreenShots(String str) throws IOException {
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // take SS

		File Dest = new File(
				"C:\\Users\\SHRADDHA\\Desktop\\velocity class pune 18June batch\\Automation Testing\\ScreenShot Selenium\\First123.jpg");
		FileHandler.copy(Source, Dest);
		
	}
}
