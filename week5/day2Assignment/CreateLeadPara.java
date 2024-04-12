package week5.day2Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadPara extends BaseClassPara {

	@DataProvider(name="inputData")
	public String[][] sendData(){
		
		String[][] data = new String[2][4];
		
		data[0][0]="TestLeaf";
		data[0][1]="Ravi";
		data[0][2]="R";
		data[0][3]="96";
		
		data[1][0]="Amazon";
		data[1][1]="Rav";
		data[1][2]="R";
		data[1][3]="90";
		
		return data;	
	}
	
	@Test(dataProvider="inputData")
		public void runCreateLead(String cName,String fName,String lName, String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(text.contains("TestLeaf")) {
			System.out.println("Lead Created Succesfully");
		}
		else {
			System.out.println("Lead not created");
		}
	}


}
