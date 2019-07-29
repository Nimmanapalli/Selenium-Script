package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ActionsAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Actions act =new Actions(driver);
		
		/*WebElement link = driver.findElement(By.id("btnLogin"));
		Actions act= new Actions(driver);
		org.openqa.selenium.interactions.Action mouseover= act.moveToElement(link).build();
		mouseover.perform(); */
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		//act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform(); keys.
		WebElement link = driver.findElement(By.linkText("PIM"));
		Actions mou= new Actions(driver);
		Action mouseover= mou.moveToElement(link).build();
		mouseover.perform();
		act.sendKeys(link,(Keys.ENTER)).build().perform();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
		
		
		
	}

}
