package week2SaturdayAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookRegAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Check ");
		driver.get("https://www.facebook.com/");
		
		       driver.findElement(By.linkText("Create new account")).click();
		       
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       
		       driver.findElement(By.name("firstname")).sendKeys("Ravindran");			

		       driver.findElement(By.name("lastname")).sendKeys("R");
		       
		       driver.findElement(By.name("reg_email__")).sendKeys("rr@gmail.com");
		       
		       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rr@gmail.com");
		       
		       driver.findElement(By.name("reg_passwd__")).sendKeys("rr@123");
		       
		       WebElement dayDD = driver.findElement(By.id("day"));
               
			    Select day = new Select(dayDD);
			    
			    day.selectByValue("4");
		       
			    WebElement monthDD = driver.findElement(By.id("month"));
	               
			    Select month = new Select(monthDD);
			    
			    month.selectByValue("11");
			    
			    WebElement yearDD = driver.findElement(By.id("year"));
	               
			    Select year = new Select(yearDD);
			    
			    year.selectByValue("1990");
			    
			    driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
			    
			    
			    driver.findElement(By.name("websubmit")).click();
		       
	}

}
