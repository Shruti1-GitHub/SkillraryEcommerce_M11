package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillararyPage;
import POM.SkillarayHomePage;
import POM.Testingpage;
import generic_library.BaseClass;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() throws Throwable
	{
		SkillarayHomePage s= new SkillarayHomePage(driver);
		s.gearbutton();
		s.Sklliararydemo();
		
		Utilities.childbrowser(driver);
		
		DemoSkillararyPage d= new DemoSkillararyPage(driver);
		Thread.sleep(3000);
		Utilities.dropDown(d.getSelectdd(),pdata.getpropertydata("coursedd"));
		Testingpage t= new Testingpage(driver);
		Utilities.Scrolling(driver, t.getFacebookbtn());
		Thread.sleep(3000);
		t.facebook();
		
		
	}

}
