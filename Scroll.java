import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class Scroll {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingenv-2021.toolsvilla.in/wolf-garten-soil-care-gh-ba-7-pilot-hand-gloves-size-7");

		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 10);
		new Actions(driver).scrollFromOrigin(scrollOrigin, 0, 1000).perform();
	}
}
