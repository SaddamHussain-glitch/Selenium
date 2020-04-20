package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ChromeOption 
{
	public static void main(String[] args)
	{
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.acceptInsecureCerts();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions co=new ChromeOptions();
		co.merge(dc);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(arg0);
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
	}

}
