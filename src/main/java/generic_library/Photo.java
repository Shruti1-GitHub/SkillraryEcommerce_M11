package generic_library;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Photo {
	
	public void getphoto(WebDriver driver, String name) throws Throwable {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File dest= new File(IPathConstant.photoPath+name+".png");
	FileUtils.copyFile(src, dest); 
	
	}

}
