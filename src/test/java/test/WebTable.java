package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.PageData;
import utility.Screenshot;

public class WebTable {
	 WebDriver driver;
		
		@BeforeMethod
		public void openBrowser() {
			 driver = LaunchBrowser.chrome("https://demo.guru99.com/test/web-table-element.php");
		}
		
		@Test()
		public void webTables(){		
		   	PageData page=new PageData(driver);	  
		   	page.webTable();
		   	
		}	
}
