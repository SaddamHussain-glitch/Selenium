package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeSheet 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://ntiretail.com/timesheet/LoginSite.aspx");
      driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
      driver.findElement(By.name("txtUserId")).sendKeys("51453570");
      driver.findElement(By.name("txtPwd")).sendKeys("Nec@51453570");
      /*File f=driver.findElement(By.id("imgCaptcha")).getScreenshotAs(OutputType.FILE);
      String path=System.getProperty("user.dir")+"/captcha.png";
      FileHandler.copy(f, new File(path));*/
      driver.findElement(By.xpath("//input[@id='txtCaptcha']")).sendKeys("test");
      driver.findElement(By.cssSelector("button[id='btnLogin']")).click();
      driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
      System.out.println(driver.findElement(By.cssSelector("span[id='lblErrorMsg'")).getText());
      driver.close();
      
      
      
      
	}

}
