package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Before clicking the link the window title is  "+driver.getCurrentUrl());
		driver.findElement(By.linkText("Click here to go to amazon.in")).click();
		System.out.println("After clicking the link the title is "+driver.getCurrentUrl() +"  Because the control will be in child window");
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> id=handles.iterator();
		String parentWindow=id.next();
		String childWindow=id.next();
		driver.switchTo().window(childWindow);
		System.out.println("After switching control title is "+driver.getCurrentUrl() );
		driver.switchTo().window(parentWindow);
		System.out.println("Switching back control to parent and title is "+driver.getCurrentUrl() );
	}

}
