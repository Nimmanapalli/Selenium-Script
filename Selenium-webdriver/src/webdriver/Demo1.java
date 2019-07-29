package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		//set the chrome driver properties
	System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
		//open the new instance of browsers/will support all the browsers
	WebDriver driver=new ChromeDriver();
		
	//System.setProperty("webdriver.gecko.driver", "C:\\Selenium-Manipal\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	//WebDriver driver1=new FirefoxDriver();
	
	//How to open the browser
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//i want to maximize it
	driver.manage().window().maximize();
	String Expectedtitle="OrangeHRM";
	//Enter the username using sendkeys
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	String ActualTitle= driver.getTitle();
	
	if(Expectedtitle.equals(ActualTitle))
	{
		// code for logut
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		//how to close the browser
		//will close the active browser instance
		driver.close();
		//Multiple browsers, then to close all the browsers i use 	driver.quit();
		//driver.close/driver.quit does not have return type and the 
		
	}
	else
	{
		System.out.println("Expected is not equal to actual");
	}
	
	
	
	
		
		

	}

}
