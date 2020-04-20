package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class StaticDropDownPractice 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		
		//Dropdown with select tag use the below code
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		//Select sel=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		sel.selectByValue("USD");
		Thread.sleep(1000);
		sel.selectByIndex(2);
		sel.selectByVisibleText("Select");
		
		//Update dropdown list with pluse and minus buttons in the list to increase the quanty
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=1;i<=4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();	
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Dynamic dropdown
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Departure City']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//we can also write the above statement as parent space child xpaths
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		//Auto suggestion dropdown list
		
		
	}

}
