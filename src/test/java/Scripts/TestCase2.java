package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillararyPage;
import POM.DownloadInvoicePage;
import POM.SkillarayHomePage;
import generic_library.BaseClass;

public class TestCase2 extends BaseClass{
	
	@Test
	public void tc2()
	{
		SkillarayHomePage ds= new SkillarayHomePage(driver);
		ds.gearbutton();
		ds.Sklliararydemo();
		Utilities.childbrowser(driver);
		DemoSkillararyPage dd= new DemoSkillararyPage(driver);
		dd.feedbackbutton();
		DownloadInvoicePage dp= new DownloadInvoicePage(driver);
		dp.downloadinvoicebtn();
		
	}

}
