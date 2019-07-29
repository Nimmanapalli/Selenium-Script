package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
		//open the new instance of browsers/will support all the browsers
		WebDriver driver=new ChromeDriver();
		
	    driver.get("http://newtours.demoaut.com/");
		//i want to maximize it
		driver.manage().window().maximize();
		//String Expectedtitle="OrangeHRM";
		//Enter the username using sendkeys
		//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@name='login']")).click();
		WebElement UN=driver.findElement(By.name("userName"));
		if(UN.isEnabled())
		{
			UN.sendKeys("sunil");
			Thread.sleep(3000);
			UN.sendKeys("sunil");
			
		}
		if (driver.findElement(By.name("userName")).isDisplayed())
			
		{
		
		//System.out.println(UN.getAttribute("value"));
		String name=UN.getAttribute ("value");
		
		System.out.println("This wil get the attribute of the value"+name);
		String name1=UN.getAttribute("name");
		System.out.println("This will get the attribute of name"+name1);
		String type=UN.getAttribute("type");
		System.out.println("This will get the attribute of name"+type);
		//get text can be used for label and also can be used for dropdown
		String label1=driver.findElement(By.xpath("//*[contains(text(),'User')]")).getText();
		System.out.println(label1);
		
		
		
	}
	}
}
