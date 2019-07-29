package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
			
			driver.get("http://elearning.upskills.in/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='login' or placeholder='Username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id='password' or placeholder='Pass']")).sendKeys("admin@123");
			driver.findElement(By.xpath("//button[@ name='submitAuth']")).click();
	        driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a[1]")).click();
	        //uPLOAD THE FILES
	        driver.findElement(By.xpath("//input[@name='import_file']")).sendKeys("C:\\Users\\NimmanapalliswathiNi\\Desktop\\Any module.csv");
	        
	}

}
