package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {
	//declaration
	
	//address of download invoice
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadInvoicebtn;
	
	//initialization
	public DownloadInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getDownloadInvoicebtn() {
		return downloadInvoicebtn;
	}

	//business library
	public void downloadInvoiceButton() {
		downloadInvoicebtn.click();
	}
}
