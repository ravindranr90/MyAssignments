package week4.day2Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
					
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				System.out.println(driver.getTitle());
				driver.findElement(By.partialLinkText("CRM")).click();
		
				driver.findElement(By.xpath("//a[text()='Contacts']")).click();//Click on the Contacts button

				driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();//Click on the Click on Merge Contacts

				driver.findElement(By.xpath("//img[@alt='Lookup']")).click();//Click on the widget of the "From Contact
				
			    Set<String> windowHandles = driver.getWindowHandles();
				List<String> handlesList=new ArrayList<>(windowHandles);
				driver.switchTo().window(handlesList.get(1));
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();//Click on the first resulting contact.
                           
								
				driver.switchTo().window(handlesList.get(0));
                
                Thread.sleep(3000);
        		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();//Click on the widget of the "To Contact
				driver.switchTo().window(handlesList.get(1));
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();//Click on the second resulting contact.

				driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();//Click on the Merge button
				
				Alert simpleAlert = driver.switchTo().alert();
				simpleAlert.accept();//Accept the alert
				
				driver.getTitle();

				

				
				
		
	}

}