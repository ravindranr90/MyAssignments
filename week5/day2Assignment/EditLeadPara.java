package week5.day2Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class EditLeadPara extends BaseClassPara{

	@DataProvider(name="inputData")
	public String[][] sendData() {
		
		String[][] data = new String[2][4];
				
		data[0][0]="96";
		data[0][1]="TCS";
		
		data[1][0]="90";
		data[1][1]="Google";
		
		return data;	
		
	}
	@Test(dataProvider="inputData")
	public void runEditLead(String phNo,String cName) throws InterruptedException  {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		String UpdatedCname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        if (UpdatedCname.contains(cName)){
        	System.out.println("Lead is editted successfully");
        }
        else {
        	System.out.println("Lead is not editted");

        }
		
}
}