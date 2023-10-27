package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;
import generic_library.BaseClass;

public class TestCase1 extends BaseClass{
   //Base class contain before and After Method 
  //Method have to take check the script, if it is failed need to take screenshot and close the app
	@Test
	public void tc1() throws Throwable {
		SkillraryHomePage s = new SkillraryHomePage(driver); //open skillrary	
		s.gearsButton(); //business library for clicking purpose of gears from skillraryHomePage 
		s.skillraryDemoApp();//business library for clicking purpose of skillrarydemoApp from skillraryHomePage
		utilities.childBrowser(driver);//shift to (next page) child page(frame)
		DemoSkillraryPage ds = new DemoSkillraryPage(driver);//open DemoSkillrarypage
		utilities.dropDown(ds.getSelectDd(), pdata.getPropertydata("coursedd"));//for open dropdown purpose
		TestingPage t = new TestingPage(driver);//click on TestingPage
		utilities.Scrolling(driver,t.getFacebook());//for scroll down purpose
		Thread.sleep(3000);
		t.FacebookWebElement();	//business library for click on facebook of Testingpage
		
	}

}
