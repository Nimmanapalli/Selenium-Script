package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.linkText("Performance")).click();
		//driver.findElement(By.id("menu_directory_viewDirectory")).click();
       
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    for (WebElement e:links)
	    {
	    	String text=e.getText(); 
	     System.out.println(text);
	    }
        
        
		
		
	}

}
