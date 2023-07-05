package forpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStox {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://neostox.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
	  
	  Thread.sleep(500);
	  
	  driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("7498220887");
	  
	  driver.findElement(By.xpath("(//a[text()='Sign In'])[2]")).click();
	  
	  Thread.sleep(500);
	  
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	  
	  Thread.sleep(500);
	  
	  driver.findElement(By.xpath("//a[text()='Submit']")).click();
	  
	  driver.findElement(By.xpath("(//span[text()='×'])[19]")).click();
	  
	  driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
	  
	  driver.navigate().refresh();
	  
	  driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
	  
	  WebElement virtualBalance = driver.findElement(By.xpath("//span[text()='Rs.5,00,000.00']"));
	  
	 System.out.println("virtual balance is "+virtualBalance.getText());
	 
	 driver.findElement(By.xpath("//input[@id='txt_instruments1']")).sendKeys("bajaj");
	  
	//  driver.findElement(By.xpath("//div[@class='d-flex px-2 pt-2 pb-0 bg-main']")).click();
	  
	//  driver.findElement(By.xpath("//a[text()='MARKET BUY 1 CONTRACTS']")).click();
	  
	  
	  
	}

}

