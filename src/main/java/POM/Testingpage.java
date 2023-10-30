package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookbtn;
	
	public Testingpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	

	public WebElement getFacebookbtn() {
		return facebookbtn;
	}




	public void facebook()
	{
		facebookbtn.click();
	}
	

}
