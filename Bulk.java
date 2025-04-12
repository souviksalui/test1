import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bulk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingenv-2021.toolsvilla.in/1-hp-self-priming-monoblock-water-pump-al-winding");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class=\"enquiry-but ng-star-inserted\"]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"bulk-form\"]//input[@placeholder=\"Name*\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//div[@class=\"bulk-form\"]//input[@placeholder=\"Email*\"]")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//div[@class=\"bulk-form\"]//input[@placeholder=\"Phone*\"]")).sendKeys("7477713410");
		driver.findElement(By.xpath("//div[@class=\"bulk-form\"]//input[@placeholder=\"Pincode*\"]")).sendKeys("713213");
		driver.findElement(By.xpath("//div[@class=\"bulk-form\"]//input[@placeholder=\"City*\"]")).sendKeys("Durgapur");
		driver.findElement(By.xpath("//div[@class=\"bulk-form\"]//input[@placeholder=\"Remark Of Purchase*\"]")).sendKeys("tyest");
		driver.findElement(By.xpath("//div[@class=\"input_wrapper ng-star-inserted\"]//select[@name=\"time\"]")).click();
		
		Select objType = new Select(driver.findElement(By.xpath("//div[@class=\"input_wrapper ng-star-inserted\"]//select[@name=\"time\"]")));
		objType.selectByValue("After 1 Month");
		driver.findElement(By.xpath("//div[@class=\"input_wrapper ng-star-inserted\"]//input[@placeholder=\"Quantity*\"]")).sendKeys("5");
		driver.findElement(By.xpath("//div[@class=\"input_wrapper ng-star-inserted\"]//input[@placeholder=\"Target Price*\"]")).sendKeys("5");
		driver.findElement(By.xpath("//div[@class=\"btn-wrapper\"]//div[@class=\"v546_143\"]")).click();
		


		
		
		
		
		
		
	}

}
