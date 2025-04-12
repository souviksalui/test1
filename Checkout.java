import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class Checkout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingenv-2021.toolsvilla.in/4-cow-dung-diya-making-machine-with-4-molds");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@class=\"mdc-button mdc-button--raised mat-mdc-raised-button addTocart mat-unthemed mat-mdc-button-base ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"mat-mdc-menu-trigger flex-row-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]//div[@class=\"mt-1\"]/a[@mattooltip=\"Checkout\"]")).click();
		
		driver.findElement(By.xpath("//form/div/input[@placeholder=\"Mobile Number\"]")).sendKeys("4444444443");
		driver.findElement(By.xpath("//form/div/button[contains(@class,\"otp-button\")]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String val = "0918";
//		for (int i = 0; i < 9999; i++) {
//			int a = Integer.parseInt(val);
//			System.out.println("Original value"+val);
//			By otpInput = By.xpath("//div//input[@id=\"otp1\"]");
//
//			// Clear the previous value in the OTP input field
//			driver.findElement(otpInput).clear();
//
//			// Input the new value of val into the OTP field
//			driver.findElement(otpInput).sendKeys(val);
//
//			driver.findElement(
//					By.xpath("//div[@class=\"text-center get-otp\"]/button[contains(@class,\"active-button\")]"))
//					.click();
////			Thread.sleep(2000);
//
//			// Attempt to locate the error message element
//			String errorText = driver
//					.findElement(By.xpath("//div[@class=\"product-dialog\"]//div[@class=\"error-validation\"]"))
//					.getText();
//			if (errorText.equals("Enter Correct Otp")) {
//
//				a++;
//				val = String.format("%04d", a);
//				System.out.println("incremented value"+val);
//			}
//
//		}
		By otpInput = By.xpath("//div//input[@id=\"otp1\"]");
		driver.findElement(otpInput).sendKeys(val);
		driver.findElement(
		By.xpath("//div[@class=\"text-center get-otp\"]/button[contains(@class,\"active-button\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"mat-mdc-form-field-flex ng-tns-c31-17\"]//input")).sendKeys("test");
//		driver.findElement(By.xpath("//div[@class=\"mat-mdc-form-field-infix ng-tns-c31-45\"]/input")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//div[@class=\"mat-mdc-form-field-infix ng-tns-c31-20\"]/input")).sendKeys("test");
		driver.findElement(By.xpath("//div[@class=\"mat-mdc-form-field-infix ng-tns-c31-21\"]/input")).sendKeys("713213");
		driver.findElement(By.xpath("//div[@class=\"mat-mdc-form-field-infix ng-tns-c31-22\"]/input")).sendKeys("test");
//		WebElement state = driver.findElement(By.xpath("//div[@class=\"mat-mdc-select-trigger ng-tns-c61-50\"]"));
//		Select option = new Select(state);
//		option.selectByValue("West Bengal");
		driver.findElement(By.xpath("//div[@class=\"mat-mdc-form-field-infix ng-tns-c31-23\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@role=\"listbox\"]//span[@class=\"mdc-list-item__primary-text\"])[35]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"mdc-radio\"]//input[@id=\"mat-radio-7-input\"]")).click();
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 10);
		new Actions(driver).scrollFromOrigin(scrollOrigin, 0, 1000).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"mdc-button mdc-button--raised mat-mdc-raised-button mat-warn mat-mdc-button-base ng-star-inserted\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"mat-cell\"]/h3[1]")).getText());
		driver.quit();
		
		
	}

}
