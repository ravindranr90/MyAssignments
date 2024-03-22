package week2.day2Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;


public class Leafground_ButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		System.out.println("The title is : "+ driver.getTitle());
		driver.navigate().back();		
		System.out.println(driver.findElement(By.xpath("(//div[@class='card'])[1]")).isSelected());
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).getCssValue("background-color"));

		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation().getY());
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize());
		driver.close();

	}

}
