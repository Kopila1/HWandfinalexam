package seleniumHW;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {
	WebDriver driver;
	By userNameField = By.xpath("//*[@id=\"username\"]");
	By passwordField = By.xpath("//*[@id=\"password\"]");
	By signinButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");
	//By dashboardHeaderField = By.xpath("//*[@id=\"side-menu\"]/li[2]/a");
	By customersField = By.xpath("//*[@id=\"side-menu\"]/li[3]/a");
	By AddcustomersField = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
	By FullNameField = By.xpath("//*[@id=\"account\"]");
	By CompanyField = By.xpath("//*[@id=\"cid\"]");
	By EmailField = By.xpath("//*[@id=\"email\"]");
	By PhoneNumerField = By.xpath("//*[@id=\"phone\"]");
	By AddressField = By.xpath("//*[@id=\"address\"]");
	By cityField = By.xpath("//*[@id=\"city\"]");
	By StateRegionField = By.xpath("//*[@id=\"state\"]");
	By ZIPCodeField = By.xpath("//*[@id=\"zip\"]");
	By countryField = By.xpath("//*[@id=\"country\"]");
	By SAVEButtonField = By.xpath("//*[@id=\"submit\"]");
	By SearchCustomersField = By.xpath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[1]/form/div/input");
	By CustomersField = By.xpath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[1]/form/div/button/i");
	
	
	
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test
	public void loginTest()throws InterruptedException{
	driver.findElement(userNameField).sendKeys("demo@techfios.com");
	driver.findElement(passwordField).sendKeys("abc123");
	driver.findElement(signinButtonField).click();
	Thread.sleep(3000);
	
	//driver.findElement(dashboardHeaderField).click();
	driver.findElement(customersField).click();
	driver.findElement(AddcustomersField).click();
	driver.findElement(FullNameField).sendKeys("KSN");
	Select selCompany = new Select(driver.findElement(CompanyField));
	selCompany.selectByVisibleText("Techfios");
	driver.findElement(EmailField).sendKeys("sapkotakopig@gmail.com");
	driver.findElement(PhoneNumerField).sendKeys("800-666-8704");
	driver.findElement(AddressField).sendKeys("Texas");
	driver.findElement(cityField).sendKeys("mckinney");
	driver.findElement(StateRegionField).sendKeys("Dallas");
	driver.findElement(ZIPCodeField).sendKeys("75071");
	
	Select selcountry = new Select(driver.findElement(countryField));
	selcountry.selectByVisibleText("Spain");
	driver.findElement(SAVEButtonField).click();
	driver.findElement(SearchCustomersField).sendKeys("KSN");
	driver.findElement(CustomersField).click();
	Thread.sleep(5000);
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		
		
	}
	

}
