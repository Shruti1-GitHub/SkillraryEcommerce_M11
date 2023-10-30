package generic_library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();
		
	}
	
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a= new Actions(driver);
		a.contextClick().perform();
	}
	
	public void MovetoElement(WebDriver driver,WebElement ele)
	{
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void draganddrop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a= new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	public void screenshot(WebDriver driver,String path) throws Throwable
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dset = new File(path);
		FileUtils.copyFile(src, dset);
	}
	public String propertyfile(String key) throws Throwable
	{
		Properties p= new Properties();
		FileInputStream fis= new FileInputStream("./src/test/resources/Data.properties");
		p.load(fis);
		return p.getProperty(key);
		
	}
	
	public void Frames(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void PopUp(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void childbrowser(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String d: child)
		{
			driver.switchTo().window(d);
		}
	}
	
	public void Scrolling(WebDriver driver, WebElement ele)
	{
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview", ele);
	}

}
