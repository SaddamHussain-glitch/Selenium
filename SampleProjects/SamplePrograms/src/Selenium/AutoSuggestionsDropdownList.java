package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsDropdownList 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
		Thread.sleep(1000);
		WebElement elmt=driver.findElement(By.xpath("//input[@name='flight_origin']"));
		elmt.sendKeys("DEL");
		Thread.sleep(1000);
		elmt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		elmt.sendKeys(Keys.ENTER);
		
	}

}
