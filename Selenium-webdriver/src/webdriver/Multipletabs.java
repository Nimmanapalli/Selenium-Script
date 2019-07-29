package webdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(3000);
		//Windowhandle will give how many number of tabs present 
		ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		//swith to is a command used to switch between browser and windows
		driver.switchTo().window(tabs.get(1));
		String title=driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(tabs.get(0));
		String title1=driver.getTitle();
		System.out.println(title1);
		if(title1.equals(title))
		{
			System.out.println("The title is same");
			
		}
		
		else
		{
			System.out.println("The title is not same");
		}
	}

}
