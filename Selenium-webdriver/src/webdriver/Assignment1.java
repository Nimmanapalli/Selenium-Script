package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver","C:\\Selenium-Manipal\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sunil");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sunil");
			driver.findElement(By.xpath("//input[@name='login']")).click();
			WebElement UN=driver.findElement(By.xpath("//input[@value='roundtrip']"));
			/*if(UN.isEnabled())
			{
				driver.findElement(By.xpath("//input[@value='oneway']")).click();
				
			} */
			
			if(UN.isSelected())
			{
				driver.findElement(By.xpath("//input[@value='oneway']")).click();
				
			} 
			WebElement DD=driver.findElement(By.name("passCount"));
		    Select sel =new Select(DD);
		    List<WebElement> data=sel.getOptions();
		    System.out.println(data.size());
		    for(int i=0; i<data.size();i++)
		    {
		     System.out.println(data.get(i).getText());
		    }
		    //using the method called select by-1st option
		    sel.selectByVisibleText("1");
		    /*Thread.sleep(30000);
		    //using the method select by idext-2nd option
		    sel.selectByIndex(2);
		    sel.selectByIndex(4);
		    Thread.sleep(30000);
			//3rd method
		    sel.selectByValue("1"); */
		    
		    driver.findElement(By.xpath("//*[@name='servClass']")).click();
		    Thread.sleep(30000);
		    driver.findElement(By.name("findFlights")).click();
		    driver.findElement(By.name("reserveFlights")).click();
		    driver.findElement(By.xpath("//*[@name='passFirst0']")).sendKeys("Meer");
		    driver.findElement(By.xpath("//*[@name='passLast0']")).sendKeys("Nag");
		    driver.findElement(By.name("creditnumber")).sendKeys("1234 5678 8769");
		   List<WebElement> checkbox= driver.findElements(By.name("ticketLess"));
		 /*  for(WebElement e:checkbox)
		   {
			   e.click();
		   } */
		   
		   for(int i=1;i<checkbox.size();i++)
		   {
			   checkbox.get(i).click();
		   }
		   

		    
		    
		    
		}
	}


