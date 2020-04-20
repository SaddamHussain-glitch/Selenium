package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo 
{

	public static void main(String[] args) 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.com/");
       driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
       Actions act=new Actions(driver);
       act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
       act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
       act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();;
       act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
       //act.contextClick(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();;
	}

}
