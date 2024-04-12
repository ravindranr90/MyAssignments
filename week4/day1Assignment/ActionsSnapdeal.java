package week4.day1Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsSnapdeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	    driver.findElement(By.xpath("//button[@id='pushAllow']")).click(); //Accept Alert
	    
	    driver.findElement(By.xpath("//span[@class='catText']")).click(); //Go to "Men's Fashion".
	    
	    driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click(); //Go to "Sports Shoes"
	    
	    String pQuantity = driver.findElement(By.xpath("//span[contains(text(),'Items')]")).getText(); //Get the count of sports shoes
        System.out.println(pQuantity);
        
	    driver.findElement(By.xpath("//div[(text()='Training Shoes')]")).click();// Click on "Training Shoes"
	    
	    Thread.sleep(2000);
		driver.findElement(By.className("sort-selected")).click();
		String sortlist = driver.findElement(By.xpath("//li[@data-sorttype='plth']")).getText();
		if (sortlist.contains("Price Low")) {
			System.out.println("Product Sorted");
		}
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
	  	    
		 Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='fromVal']")).clear();//Select any price range ex:(500-700).
	    driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
	    driver.findElement(By.xpath("//input[@name='toVal']")).clear();
	    driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
        driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
	        
        Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();	
        	    
	    Thread.sleep(3000);
	    WebElement blkShoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
        Actions builder =new Actions(driver); //Mouse hover on the first resulting "Training Shoes"
        builder.moveToElement(blkShoe).perform();
        
	    driver.findElement(By.xpath("//div[contains(text(),'Quick')]")).click();//Click the "Quick View" button
	    
	    Thread.sleep(3000);
	    String discountPrice = driver.findElement(By.xpath("//span[text()='575 ']")).getText();
	    System.out.println(discountPrice);// Print the cost 
	    
	    String discountPercentage = driver.findElement(By.xpath("//span[text()='42% Off']")).getText();
	    System.out.println(discountPercentage);// Print the discount percentage
	    
	    Thread.sleep(3000);
	    File src = driver.getScreenshotAs(OutputType.FILE);//Take a snapshot of the shoes
        File dest=new File("./Snaps/Snapdeal.png");
        FileUtils.copyFile(src, dest);
	    
	    driver.close();
	    driver.quit();
	}

}
