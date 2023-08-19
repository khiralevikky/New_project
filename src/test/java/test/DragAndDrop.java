package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.PageData;
import utility.Screenshot;

public class DragAndDrop {
    WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		 driver = LaunchBrowser.chrome("https://www.globalsqa.com/demo-site/draganddrop/");
	}
	
	@Test()
	public void dragFrame1() throws IOException {		
	   	PageData page=new PageData(driver);	  
	   	page.switchFrames(driver);
	   	page.frames(driver);	   	
	    Screenshot.clickScreenshot(driver,"dragdrop");
	}	

}
