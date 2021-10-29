package UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Take {

	public static void screenshot(WebDriver driver1) throws IOException {

		File source = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd hh.mm.ss").format(new Date());
		File dstination = new File("C:\\Users\\SAGAR-PC\\Pictures\\Screenshot\\OrangeHRM\\" + timestamp + ".jpg");
		FileHandler.copy(source, dstination);
	}

}
