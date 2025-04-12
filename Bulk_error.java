import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bulk_error {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingenv-2021.toolsvilla.in/1-hp-self-priming-monoblock-water-pump-al-winding");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[normalize-space()='Buy In Bulk']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class=\"btn-wrapper\"]//div[@class=\"v546_143\"]")).click();//2,3,4,6,7,8,9,5,10,11
		
		
		
		System.out.println("This are error messages:"
				+"\n----------------------------------------------------------"
		        + "\n" + "Name: " + driver.findElement(By.id("mat-mdc-error-2")).getText()
				+ "\n" + "Email: " +driver.findElement(By.id("mat-mdc-error-3")).getText()
				+ "\n" + "Phone: " +driver.findElement(By.id("mat-mdc-error-4")).getText()
				+ "\n" + "Pincode: " +driver.findElement(By.id("mat-mdc-error-6")).getText()
				+ "\n" + "City: " +driver.findElement(By.id("mat-mdc-error-7")).getText()
				+ "\n" + "State: " +driver.findElement(By.id("mat-mdc-error-8")).getText()
				+ "\n" + "How soon you want the product: " + driver.findElement(By.id("mat-mdc-error-9")).getText() 
				+ "\n" + "Remark: " +driver.findElement(By.id("mat-mdc-error-5")).getText()
				+ "\n" +"Quantity: " +driver.findElement(By.id("mat-mdc-error-10")).getText()
				+ "\n" +"Target Price: " +driver.findElement(By.id("mat-mdc-error-11")).getText()
				);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
