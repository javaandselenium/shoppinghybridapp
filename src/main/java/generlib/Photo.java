package generlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Photo implements Autoconstant{
	public static void getphoto(WebDriver driver,String name)
	{
		Date d=new Date();
		String date = d.toString().replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(photopath+date+name+".png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			Reporter.log("photo cannot be taken",true);
		}
		
		
		
	}

}
