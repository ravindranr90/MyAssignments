package week2.day2Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Interactions_With_CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[5]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-toggleswitch-slider')])")).click();
		System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox ui-widget')])[3]")).isSelected());
		
		WebElement selectMultipleDD = driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']"));
		selectMultipleDD.click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Basic");
		driver.close();

			
		
	}

}

