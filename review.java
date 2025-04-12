import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class review {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingenv-2021.toolsvilla.in/made-in-india-26mm-weeder-attachment");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.executeScript("window.scrollBy(0,1200)", "");
		driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']")).click();
        Thread.sleep(2000);
		
//		driver.executeScript("window.scrollBy(0,1000)", "");

		
		driver.findElement(By.xpath("//button[@class='review-btn mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']//span[@class='mat-mdc-button-touch-target']")).click();
		
		driver.executeScript("window.scrollBy(0,1200)", "");
		
		driver.findElement(By.xpath("//span[normalize-space()='SUBMIT REVIEW']")).click();
		
		System.out.println("This are error messages:"
				+"\n----------------------------------------------------------"
		        + "\n" + "Name: " + driver.findElement(By.id("mat-mdc-error-5")).getText()
//				+ "\n" + "Email: " +driver.findElement(By.id("mat-mdc-error-3")).getText()
//				+ "\n" + "Phone: " +driver.findElement(By.id("mat-mdc-error-4")).getText()
//				+ "\n" + "Pincode: " +driver.findElement(By.id("mat-mdc-error-6")).getText()
//				+ "\n" + "City: " +driver.findElement(By.id("mat-mdc-error-7")).getText()
//				+ "\n" + "State: " +driver.findElement(By.id("mat-mdc-error-8")).getText()
//				+ "\n" + "How soon you want the product: " + driver.findElement(By.id("mat-mdc-error-9")).getText() 
//				+ "\n" + "Remark: " +driver.findElement(By.id("mat-mdc-error-5")).getText()
//				+ "\n" +"Quantity: " +driver.findElement(By.id("mat-mdc-error-10")).getText()
//				+ "\n" +"Target Price: " +driver.findElement(By.id("mat-mdc-error-11")).getText()
				);
		Thread.sleep(3000);
		driver.quit();
	}	

}
