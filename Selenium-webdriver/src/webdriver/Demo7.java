package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("http://retail.upskills.in/admin/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.id("Password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[Password")).sendKeys("admin123");
		Actions act =new Actions(driver);

	}

}
