package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillarayHomePage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillararydemoapp;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtf;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	
	public SkillarayHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	

	public WebElement getSkillararydemoapp() {
		return skillararydemoapp;
	}

	

	public WebElement getSearchtf() {
		return searchtf;
	}


	public WebElement getSearchicon() {
		return searchicon;
	}
	
	public void gearbutton()
	{
		gearsbtn.click();
	}
	
	public void Sklliararydemo()
	{
		skillararydemoapp.click();
		
	}
	
	public void searchtextfiled(String data)
	{
		searchtf.sendKeys(data);
	}

	public void searchIcon()
	{
		searchicon.click();
	}
	
	
}