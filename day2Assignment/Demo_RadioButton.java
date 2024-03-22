package week2.day2Assignment;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		
//		driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet']")).click();

		driver.findElement(By.xpath("//label[text()='Chrome']")).click();		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();		

		System.out.println(driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled());

		
	//	driver.close();
		
		
	}

}
