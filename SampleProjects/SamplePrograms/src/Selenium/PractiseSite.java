package Selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSite 
{

	public static void main(String[] args) throws InterruptedException 
	{
       String[] itemsReq= {"Cucumber","Brocolli"};
		
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\saddam.hussain\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://rahulshettyacademy.com/seleniumPractise/");
       driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
       List<WebElement> productList=driver.findElements(By.cssSelector("h4[class='product-name']"));
       
       List itemReqList=Arrays.asList(itemsReq);
       
       for(int i=0;i<productList.size();i++)
       {
    	  String productName= productList.get(i).getText().split(" -")[0];
    	   if(itemReqList.contains(productName))
    	   {
    		   Thread.sleep(5000);
    		   driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
    		   Thread.sleep(1000);
    		   System.out.println(itemReqList.size());
    	   }
       }
	}
}	
	
	
	/*
	 import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class base {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");



WebDriver driver=new ChromeDriver();



String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





driver.get("https://rahulshettyacademy.com/seleniumPractise/");

Thread.sleep(3000);

addItems(driver,itemsNeeded);

}

public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;

List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

for(int i=0;i<products.size();i++)

{

//Brocolli - 1 Kg

//Brocolli,    1 kg

String[] name=products.get(i).getText().split("-");

String formattedName=name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

List itemsNeededList = Arrays.asList(itemsNeeded);

if(itemsNeededList.contains(formattedName))

{

j++;

//click on Add to cart

driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

if(j==itemsNeeded.length)

{

break;

}

}

}

}



}




	 */
	 

