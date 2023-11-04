import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Opencart {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		//Navigate to browser url
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		// mouser over to menu page
		
		WebElement Laptop= driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		Actions action = new Actions(driver);
		action.moveToElement(Laptop).build().perform();
		
		// click on the required options 
		WebElement Showall= driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		action.moveToElement(Showall).click().build().perform();
		TimeUnit.SECONDS.sleep(5);
		
		// scroll down the particular item and click on the item
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement scroll =driver.findElement(By.xpath("//a[text()='MacBook']"));
		
        jse.executeScript("arguments[0].scrollIntoView();", scroll);

        jse.executeScript("arguments[0].click();", scroll);
        WebElement Cart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
        
        jse.executeScript("arguments[0].click();", Cart);
        
       TimeUnit.SECONDS.sleep(2);
        WebElement Msg= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        String Actual = Msg.getText();
        
        System.out.println(Msg.getText());
        
        String s= "Success: You have added MacBook to your shopping cart!";
        Assert.assertEquals(s,Actual);
        
         WebElement Cam = driver.findElement(By.xpath("//a[text()='Cameras']"));
         action.moveToElement(Cam).click().build().perform();
         
         
         WebElement Canon=driver.findElement(By.xpath("//a[contains(text(),'Nikon D300')]"));
         
         
         jse.executeScript("arguments[0].scrollIntoView();",Canon );
         TimeUnit.SECONDS.sleep(3);
         Canon.click();
         TimeUnit.SECONDS.sleep(5);
         
         WebElement Canaon1=driver.findElement(By.xpath("//button[contains(text( ),'Add to Cart')]"));
         jse.executeScript("arguments[0].click();",Canaon1);
         
         TimeUnit.SECONDS.sleep(2);
         WebElement Msg1= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
         
         
         String Camactual = Msg1.getText();
         System.out.println(Msg1.getText());
         String c= "Success: You have added Nikon D300 to your shopping cart!";
         Assert.assertEquals(c, Msg1.getText());
         driver.navigate().back();
         
         
         
         
         
         
         
        
        
        
        
		
		
	}
	
		
}
