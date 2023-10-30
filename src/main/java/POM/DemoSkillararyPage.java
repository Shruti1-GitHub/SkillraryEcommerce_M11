package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillararyPage {
	@FindBy(name="addresstype")
	private WebElement selectdd;
	
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;

	public DemoSkillararyPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSelectdd() {
		return selectdd;
	}


	public WebElement getFeedbackbtn() {
		return feedbackbtn;
	}

	public void feedbackbutton()
	{
		feedbackbtn.click();
	}
	
	
}
