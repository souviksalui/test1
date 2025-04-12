import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyNow {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingenv-2021.toolsvilla.in/oswal-three-phase-ac-electric-motor-3hp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@class=\"mdc-button mdc-button--raised mat-mdc-raised-button addTocart2 mat-unthemed mat-mdc-button-base ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"mat-mdc-menu-trigger flex-row-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"cdk-overlay-container\"]//div[@class=\"mt-1\"]/a[@mattooltip=\"View Cart\"]")).click();
		
		driver.findElement(By.xpath("//form/div/input[@placeholder=\"Mobile Number\"]")).sendKeys("3333333333");
		driver.findElement(By.xpath("//form/div/button[contains(@class,\"otp-button\")]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		String val = "0000";
		for (int i = 0; i < 9999; i++) {
			int a = Integer.parseInt(val);
			System.out.println("Original value"+val);
			By otpInput = By.xpath("//div//input[@id=\"otp1\"]");

			// Clear the previous value in the OTP input field
			driver.findElement(otpInput).clear();

			// Input the new value of val into the OTP field
			driver.findElement(otpInput).sendKeys(val);

			driver.findElement(
					By.xpath("//div[@class=\"text-center get-otp\"]/button[contains(@class,\"active-button\")]"))
					.click();
//			Thread.sleep(2000);

			// Attempt to locate the error message element
			String errorText = driver
					.findElement(By.xpath("//div[@class=\"product-dialog\"]//div[@class=\"error-validation\"]"))
					.getText();
			if (errorText.equals("Enter Correct Otp")) {

				a++;
				val = String.format("%04d", a);
				System.out.println("incremented value"+val);
			}

		}
		
		

	}

}
