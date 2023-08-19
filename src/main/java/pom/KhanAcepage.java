package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcepage {
	@FindBy (xpath = "//input[@id='uid-login-form-0-wb-id-identifier-field']")private WebElement email;
	@FindBy (xpath = "//input[@id='uid-labeled-text-field-1-wb-id-field']")private WebElement pass;
	@FindBy (xpath ="//button[@data-test-id='log-in-submit-button']")private WebElement login;
	
	public KhanAcepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	public void enterEmailId(String id) {
		email.sendKeys(id);
	}
	public void enterPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void clickOnLogin() {
		login.click();
	}
}
