package week2SaturdayAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webElementInteractionAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Check ");
		driver.get("http://leaftaps.com/opentaps/control/main");
		
			
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				 
				System.out.println(driver.getTitle());
				
				driver.findElement(By.partialLinkText("CRM")).click();
                
				driver.findElement(By.linkText("Accounts")).click();
				
				driver.findElement(By.linkText("Create Account")).click();
				
				driver.findElement(By.id("accountName")).sendKeys("Test Leaf");
				
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
			    WebElement industryDD = driver.findElement(By.name("industryEnumId"));
                
			    Select sec = new Select(industryDD);
			    
			    sec.selectByIndex(3);
			   
			    WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
                
			    Select own = new Select(ownershipDD);
			    
			    own.selectByVisibleText("S-Corporation");
			   
				
			    WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
                
			    Select sour = new Select(sourceDD);
			    
			    sour.selectByVisibleText("Employee");
				
			    WebElement marketingcampaignDD = driver.findElement(By.id("marketingCampaignId"));
                
			    Select marc = new Select(marketingcampaignDD);
			    
			    marc.selectByIndex(6);
			    
               WebElement stateprovinceDD = driver.findElement(By.id("generalStateProvinceGeoId"));
                
			    Select state = new Select(stateprovinceDD);
			    
			    state.selectByVisibleText("Texas");
			    
			    driver.findElement(By.className("smallSubmit")).click();


	}

}
