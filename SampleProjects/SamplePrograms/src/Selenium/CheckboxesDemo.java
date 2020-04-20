package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxesDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//driver.mansage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		WebElement chkbox=driver.findElement(By.cssSelector("div[id*='SeniorCitizen']"));
		chkbox.click();
		//to check whether a checkbox is selected or not
		Assert.assertFalse(chkbox.isSelected());//wildcard search using css
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div[id*='SeniorCitizen']")).isSelected());
		
		//To find the count of all the checkboxes in the page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
