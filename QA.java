import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingenv-2021.toolsvilla.in/made-in-india-26mm-weeder-attachment");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c49-3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c49-7']")).click();
//		driver.executeScript("window.scrollBy(0,1000)", "");

		
		driver.findElement(By.xpath("//textarea[@id='mat-input-1']")).sendKeys("Testing question");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("7477713410"); ////button[@type='submit']//span[@class='mat-mdc-button-touch-target']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("test@test.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='SUBMIT QUERY']")).click();
		
		////div[@class='alert alert-primary ng-star-inserted']
		
		System.out.println("This is the submit message:"
				+"\n----------------------------------------------------------"
		        + "\n" + "Name: " + driver.findElement(By.xpath("/div[@class='alert alert-primary ng-star-inserted']")).getText()
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
