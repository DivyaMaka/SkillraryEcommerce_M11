package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_library.BaseClass;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() {
	SkillraryHomePage s = new SkillraryHomePage(driver); //open skillrary	
	s.gearsButton(); //business library for clicking purpose of gears from skillraryHomePage
	s.skillraryDemoApp();//business library for clicking purpose of skillrarydemoApp from skillraryHomePage
	utilities.childBrowser(driver);
	DemoSkillraryPage ds = new DemoSkillraryPage(driver);//open DemoSkillrarypage
	ds.feedBackbtn();//business library for clicking purpose of feedbackbtn from DemoskillraryPage
	DownloadInvoicePage dI = new DownloadInvoicePage(driver);
	dI.downloadInvoiceButton();//business library for clicking purpose of downloadInvoiceBtn from DownloadInvoicePage
	}
}
