package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {

	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadinvoice;
	
	public DownloadInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDownloadinvoice() {
		return downloadinvoice;
	}

	public void downloadinvoicebtn()
	{
		downloadinvoice.click();
	}
	
}
