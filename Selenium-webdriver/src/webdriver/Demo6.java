package webdriver;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
		Actions act= new Actions(driver);
		org.openqa.selenium.interactions.Action mouseover= act.moveToElement(link).build();
		mouseover.perform();
		act.sendKeys(link,(Keys.ENTER)).build().perform();
		
	}

}
