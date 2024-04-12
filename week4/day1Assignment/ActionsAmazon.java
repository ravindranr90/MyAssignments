package week4.day1Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    String productPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	    System.out.println(productPrice);
	    String productRating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
	    System.out.println(productRating);
	    driver.findElement(By.xpath("//span[@class='a-price-whole']")).click();
	    
	    String pWindowHandle = driver.getWindowHandle();
	    Set<String> windowHandles = driver.getWindowHandles();
		List<String> handlesList=new ArrayList<>(windowHandles);
		driver.switchTo().window(handlesList.get(1));
	    Thread.sleep(3000);
        File src = driver.getScreenshotAs(OutputType.FILE);
        File dest=new File("./Snaps/Amazon.png");
        FileUtils.copyFile(src, dest);
        
        Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	    
	    Thread.sleep(3000);
	    String subTotal = driver.findElement(By.xpath("  //span[@id='attach-accessory-cart-subtotal']")).getText();
        if (productPrice.equals(subTotal)) {
        System.out.println("The Subtotal of the order is correct");
        } 
        else {
            System.out.println("The Subtotal of the order is incorrect");
        }	
	//	driver.quit();
	}
}
