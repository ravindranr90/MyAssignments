package week2.day2Assignment;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ravindran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Information Technology");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Developing Software Applications");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("rr@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9999999999");

		
  
		WebElement stateDD = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select state = new Select(stateDD);                      
		
		state.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		WebElement ClearDesc = driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
		ClearDesc.clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Delivering QA checked Software Products");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		driver.getTitle();
	    driver.close();

}
}