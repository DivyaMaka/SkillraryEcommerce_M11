package generic_library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	    //1.handling Dropdowns
	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//2.handling Mouseover 
	public void Mouseovering(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();	
	}
	
	 //3.handling right click
			public void rightclick(WebDriver driver,WebElement ele) {
				Actions a = new Actions(driver);
				a.contextClick(ele).perform();
	}
				
	 //4.handling double click
		public void doubleclick(WebDriver driver,WebElement ele) {
			Actions a = new Actions(driver);
			a.doubleClick(ele).perform();	
		}
				
	//5.handling drag and drop
		 public void DragAndDrop(WebDriver driver, WebElement ele1, WebElement ele2) {
					Actions a = new Actions(driver);
					a.dragAndDrop(ele1,ele2).perform();
		 }
		
	//6.handling frame 
		 public void frames(WebDriver driver, String value) {
			 driver.switchTo().frame(value);
		 }
		
	//7.handling Default content
		 public void frames(WebDriver driver) {
			 driver.switchTo().defaultContent();
		 }
 		 		 
	//8.handling scrolling 
		 public void Scrolling(WebDriver driver, WebElement ele) {
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		 js.executeScript("arguments[0].scrollIntoView();", ele); 
		 }
		 
	//9.handling Alert popUp
		 public void alertpopup(WebDriver driver) {
		 driver.switchTo().alert().accept();
		 }
		 
	//10.handling  childBrowser
		 public void childBrowser(WebDriver driver) {
			 Set<String> child = driver.getWindowHandles();
			 for (String b:child) {
				 driver.switchTo().window(b);
			 }
		 }

}
