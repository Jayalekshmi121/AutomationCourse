package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harikrishan S\\Desktop\\Java\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");

	}
	public void getTitleCommand() {
		
		String actualTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String title=driver.getTitle();
		
		if(title.equals(actualTitle))
		{
			System.out.println("Titles are equal");
		}else 
		{
			System.out.println("Titles are not equal");
		}
		}
	
	public void getUrlCommand() {
		
		String actualUrl ="https://www.amazon.in/";
		String url=driver.getCurrentUrl();
		
		if(url.equals(actualUrl))
		{
			System.out.println("Urls are equal");
		}else 
		{
			System.out.println("Urls are not equal");
		}
		}
	
	public void getPageSourceCommand() {
		String actualpageSource="window.ue_ihb = (window.ue_ihb || window.ueinit";
		String pageSource=driver.getPageSource();
		if(pageSource.contains(actualpageSource))
		{
			System.out.println("Page source is present");
		}else 
		{
			System.out.println("Page source is not present");
		}
		
	}
	public void afterTest() {
		//driver.close();
		driver.quit();
	}
	
	public void navigateCommands() {
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	  public static void main(String[] args) { 
		  Base base =new Base();
		  base.initialiseBrowser();
		  base.getTitleCommand(); 
		  base.getUrlCommand();
		  base.getPageSourceCommand();
		  base.navigateCommands(); 
		  base.afterTest();
	  
	  
	  }
	 

}
