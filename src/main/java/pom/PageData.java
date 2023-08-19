package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageData {

	@FindBy (xpath ="//iframe[@class='demo-frame lazyloaded']")private WebElement iframes;
	@FindBy (xpath ="//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']")private WebElement source;
	@FindBy (xpath ="(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[2]")private WebElement source2;
	@FindBy (xpath ="(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[3]")private WebElement source3;
	@FindBy (xpath ="(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[4]")private WebElement source4;           
	@FindBy (xpath ="//div[@id='trash']")private WebElement trash;
	
	@FindBy (xpath ="//table//thead//tr//th")private List<WebElement> table;
	
	public PageData(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	public void switchFrames(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(iframes);
	}
	
	public void frames(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, trash);
		actions.dragAndDrop(source2, trash);
		actions.dragAndDrop(source3, trash);
		actions.dragAndDrop(source4, trash);
		actions.perform();
	} 
	
	public void webTable() {
		for(int i=0; i<table.size();i++) {
	    	String name=table.get(i).getText();
	    	System.out.println(name);
	    }
	}	
}
