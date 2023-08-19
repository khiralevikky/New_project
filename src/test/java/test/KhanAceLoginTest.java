package test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import pojo.LaunchBrowser;
import pom.KhanAcepage;

@Listeners(test.Listeners.class)
public class KhanAceLoginTest {
    WebDriver driver;
	
	@BeforeMethod
	public void openbBrowser() {
		driver=LaunchBrowser.chrome("https://www.khanacademy.org/login");
	}
	@Test(priority= 1)
	public void loginWithValidCredentials() {	
		KhanAcepage obj=new KhanAcepage(driver);
		obj.enterEmailId("vikky@gmail");
		obj.enterPassword("12345");
		obj.clickOnLogin();
	}
	@Test(priority=2)
	public void loginWithInvalidUsername() {
		KhanAcepage login2=new KhanAcepage(driver);
		login2.enterEmailId("abc@gmail.com");
		login2.enterPassword("12345");
		login2.clickOnLogin();
	}
    
}
