package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
		//open the new instance of browsers/will support all the browsers
		WebDriver driver=new ChromeDriver();
		
	    driver.get("http://newtours.demoaut.com/");
		//i want to maximize it
		driver.manage().window().maximize();
		//String Expectedtitle="OrangeHRM";
		//Enter the username using sendkeys
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sunil");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sunil");
		//driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.name("login")).click();
	}

}
