package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert 
{

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver","C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
      driver.findElement(By.id("name")).sendKeys("Saddam");
      driver.findElement(By.cssSelector("input[id=alertbtn]")).click();
      Thread.sleep(1000);
      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();
      
      driver.findElement(By.xpath("//input[@value='Confirm']")).click();
      Thread.sleep(1000);
      driver.switchTo().alert().dismiss();
	}

}
