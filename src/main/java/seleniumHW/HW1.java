package seleniumHW;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	WebDriver driver;
	
    @Before
	public void init() {
    System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://techfios.com/billing/?ng=dashboard/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
  @Test
    public void loginTest() throws InterruptedException {
	  driver.get("https://techfios.com/billing/?ng=admin/");
	  driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	  driver.findElement(By.id("password")).sendKeys("abc123");
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//span[text() = 'Bank & Cash']")).click();
	  driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"account\"]")).sendKeys("Saving and checking");
	  driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("my checking account");
	  driver.findElement(By.xpath("//*[@id=\"balance\"]")).sendKeys("1,000");
	  driver.findElement(By.xpath("//*[@id=\"account_number\"]")).sendKeys("12345678912");
	  driver.findElement(By.xpath("//*[@id=\"contact_person\"]")).sendKeys("Mimi");
	  driver.findElement(By.xpath("//*[@id=\"contact_phone\"]")).sendKeys("9124849459");
	  driver.findElement(By.xpath("//*[@id=\"ib_url\"]")).sendKeys("bankofamerica.com");
	  driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();
	  Thread.sleep(4000);
  }
	 
	  @After
	  public void tearDown() {
		driver.close();
	    driver.quit();
	  }
	  
	   }


	

  
   
 


