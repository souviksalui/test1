import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginContinue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingenv-2021.toolsvilla.in/");
		driver.findElement(By.xpath("//div[@class=\"header header-desk\"]//button[contains(@class,\"relative\")]"))
				.click();
		driver.findElement(By.xpath("//div[@class=\"login-menu\"]/div[@class=\"menu-item\"]")).click();
		driver.findElement(By.xpath("//form/div/input[@placeholder=\"Mobile Number\"]")).sendKeys("3333333333");
		driver.findElement(By.xpath("//form/div/button[contains(@class,\"otp-button\")]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String val = "0000";

		By otpInput = By.xpath("//div//input[@id=\"otp1\"]");

		driver.findElement(otpInput).sendKeys(val);

		driver.findElement(By.xpath("//div[@class=\"text-center get-otp\"]/button[contains(@class,\"active-button\")]"))
				.click();
//		Thread.sleep(2000);

		
		}

	

}
