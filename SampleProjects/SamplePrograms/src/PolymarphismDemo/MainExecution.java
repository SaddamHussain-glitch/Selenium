package PolymarphismDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainExecution 
{

	public static void main(String[] args) 
	{
		
		Child c=new Child();
        c.parentMethod1();
        c.parentMethod2();
        c.childMethod();
        Parent p=new Child();
        p.parentMethod1();
        p.parentMethod2();
       
	}

}
System.setProperty("webdriver.chrome.driver", "C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();	
driver.get("http://www.google.com");
driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
System.out.println(driver.getTitle());
driver.close();