package week2.day2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        
        driver.findElement(By.name("phoneNumber")).sendKeys("9999999999");
       // driver.findElement(By.xpath("//input[@id='']")).sendKeys("9999999999");
        driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
        Thread.sleep(1000);
        
        WebElement leadidElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        String LeadID = leadidElement.getText();
        System.out.println("The Captured ID is "+LeadID);
        leadidElement.click();
        
        driver.findElement(By.xpath("(//a[@class='subMenuButtonDangerous'])[1]")).click();

        
       

		
}

}