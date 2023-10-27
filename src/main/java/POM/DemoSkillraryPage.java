package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
	//declaration
	
	//address of select category
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	//address of feedback
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedBackbtn;
	
	//initilization
	public DemoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization 
	public WebElement getSelectDd() {
		return selectDd;
	}
	
	public WebElement getFeedBackbtn() {
		return feedBackbtn;
	}

	//business library
	public void feedBackbtn() {
		feedBackbtn.click();
	}
}
